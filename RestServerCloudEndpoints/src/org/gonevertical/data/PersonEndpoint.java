package org.gonevertical.data;

import org.gonevertical.data.PMF;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "personendpoint")
public class PersonEndpoint {

  /**
   * This method lists all the entities inserted in datastore.
   * It uses HTTP GET method.
   *
   * @return List of all entities persisted.
   */
  @SuppressWarnings({"cast", "unchecked"})
  public List<Person> listPerson() {
    PersistenceManager mgr = getPersistenceManager();
    List<Person> result = new ArrayList<Person>();
    try{
      Query query = mgr.newQuery(Person.class);
      for (Object obj : (List<Object>) query.execute()) {
        result.add(((Person) obj));
      }
    } finally {
      mgr.close();
    }
    return result;
  }

  /**
   * This method gets the entity having primary key id. It uses HTTP GET method.
   *
   * @param id the primary key of the java bean.
   * @return The entity with primary key id.
   */
  public Person getPerson(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
    Person person  = null;
    try {
      person = mgr.getObjectById(Person.class, id);
    } finally {
      mgr.close();
    }
    return person;
  }

  /**
   * This inserts the entity into App Engine datastore.
   * It uses HTTP POST method.
   *
   * @param person the entity to be inserted.
   * @return The inserted entity.
   */
  public Person insertPerson(Person person) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mgr.makePersistent(person);
    } finally {
      mgr.close();
    }
    return person;
  }

  /**
   * This method is used for updating a entity.
   * It uses HTTP PUT method.
   *
   * @param person the entity to be updated.
   * @return The updated entity.
   */
  public Person updatePerson(Person person) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mgr.makePersistent(person);
    } finally {
      mgr.close();
    }
    return person;
  }

  /**
   * This method removes the entity with primary key id.
   * It uses HTTP DELETE method.
   *
   * @param id the primary key of the entity to be deleted.
   * @return The deleted entity.
   */
  public Person removePerson(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
     Person person  = null;
    try {
      person = mgr.getObjectById(Person.class, id);
      mgr.deletePersistent(person);
    } finally {
      mgr.close();
    }
    return person;
  }

  private static PersistenceManager getPersistenceManager() {
    return PMF.get().getPersistenceManager();
  }

}
