package org.gonevertical.server.endpoints;

import org.datanucleus.store.appengine.query.JDOCursorHelper;
import org.gonevertical.server.data.PMF;
import org.gonevertical.server.data.Person;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.search.Consistency;
import com.google.appengine.api.search.Document;
import com.google.appengine.api.search.Field;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.IndexSpec;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import com.google.appengine.api.search.SearchServiceFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(
     name = "personendpoint",
     description = "This entity represents a person.",
     clientIds = { "734175750239.apps.googleusercontent.com" }, 
     version = "v2")
public class PersonEndpoint {

  private static final Index INDEX = getIndex();

  private static Index getIndex() {
    IndexSpec indexSpec = IndexSpec.newBuilder().setName("person_index").setConsistency(Consistency.PER_DOCUMENT)
        .build();
    return SearchServiceFactory.getSearchService().getIndex(indexSpec);
  }

  public static void addToSearchIndex(Person p) {
    Document.Builder docBuilder = Document.newBuilder()
        .addField(Field.newBuilder().setName("id").setText(Long.toString(p.getId())))
        .addField(Field.newBuilder().setName("nameFirst").setText(p.getNameFirst() != null ? p.getNameFirst() : ""))
        .addField(Field.newBuilder().setName("nameLast").setText(p.getNameLast() != null ? p.getNameLast() : ""));
    docBuilder.setId(Long.toString(p.getId()));
    Document doc = docBuilder.build();
    INDEX.add(doc);
  }

  private static PersistenceManager getPersistenceManager() {
    return PMF.get().getPersistenceManager();
  }

  @ApiMethod(
      httpMethod = "GET",
      name = "person.list", 
      path = "person/list", 
      clientIds = { "734175750239.apps.googleusercontent.com" }, 
      scopes = { "https://democloudpoint.appspot.com/auth/personendpoints" })
  @SuppressWarnings({ "cast", "unchecked" })
  public CollectionResponse<Person> listPerson(@Nullable @Named("cursor") String cursorString,
      @Nullable @Named("limit") Integer limit) {
    PersistenceManager pm = null;
    Cursor cursor = null;
    List<Person> execute = null;
    try {
      pm = getPersistenceManager();
      Query query = pm.newQuery(Person.class);

      if (cursorString != null && cursorString != "") {
        cursor = Cursor.fromWebSafeString(cursorString);
        Map<String, Object> extensionMap = new HashMap<String, Object>();
        extensionMap.put(JDOCursorHelper.CURSOR_EXTENSION, cursor);
        query.setExtensions(extensionMap);
      }

      if (limit != null) {
        query.setRange(0, limit);
      }

      execute = (List<Person>) query.execute();
      cursor = JDOCursorHelper.getCursor(execute);

      if (cursor != null) {
        cursorString = cursor.toWebSafeString();
      } else {
        cursorString = "";
      }

      execute.size();
    } finally {
      pm.close();
    }

    return CollectionResponse.<Person> builder().setItems(execute).setNextPageToken(cursorString).build();
  }

  @ApiMethod(httpMethod = "GET", 
      name = "person.get",
      path = "person/get/{id}",
      clientIds = { "734175750239.apps.googleusercontent.com" }, 
      scopes = { "https://democloudpoint.appspot.com/auth/personendpoints" })
  public Person getPerson(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
    Person person = null;
    try {
      person = mgr.getObjectById(Person.class, id);
    } finally {
      mgr.close();
    }
    return person;
  }

  @ApiMethod(
      httpMethod = "POST",
      name = "person.insert",
      path = "person/insert",
      clientIds = { "734175750239.apps.googleusercontent.com" }, 
      scopes = { "https://democloudpoint.appspot.com/auth/personendpoints" })
  public Person insertPerson(Person person) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mgr.makePersistent(person);
      addToSearchIndex(person);
    } finally {
      mgr.close();
    }
    return person;
  }

  @ApiMethod(
      httpMethod = "POST",
      name = "person.update",
      path = "person/update",
      clientIds = { "734175750239.apps.googleusercontent.com" }, 
      scopes = { "https://democloudpoint.appspot.com/auth/personendpoints" })
  public Person updatePerson(Person person) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mgr.makePersistent(person);
      addToSearchIndex(person);
    } finally {
      mgr.close();
    }
    return person;
  }

  @ApiMethod(
      httpMethod = "GET",
      name = "person.remove",
      path = "person/remove/{id}",
      clientIds = { "734175750239.apps.googleusercontent.com" }, 
      scopes = { "https://democloudpoint.appspot.com/auth/personendpoints" })
  public Person removePerson(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
    Person person = null;
    try {
      person = mgr.getObjectById(Person.class, id);
      mgr.deletePersistent(person);
      INDEX.remove(person.getId().toString());
    } finally {
      mgr.close();
    }
    return person;
  }

  @ApiMethod(
      httpMethod = "GET", 
      name = "person.search",
      path = "person/search/{queryString}",
      clientIds = { "734175750239.apps.googleusercontent.com" }, 
      scopes = { "https://democloudpoint.appspot.com/auth/personendpoints" })
  public List<Person> search(@Named("queryString") String queryString) {
    List<Person> returnList = new ArrayList<Person>();
    Results<ScoredDocument> searchResults = INDEX.search(queryString);

    for (ScoredDocument scoredDoc : searchResults) {
      Field fieldId = scoredDoc.getOnlyField("id");
      if (fieldId == null || fieldId.getText() == null)
        continue;

      long personId = Long.parseLong(fieldId.getText());
      if (personId != -1) {
        Person p = getPerson(personId);
        returnList.add(p);
      }
    }
    return returnList;
  }
  
}
