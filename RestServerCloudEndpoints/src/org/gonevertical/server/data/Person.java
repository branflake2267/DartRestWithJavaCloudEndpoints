package org.gonevertical.server.data;

import java.util.HashSet;
import java.util.logging.Logger;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * insert
 * curl -H 'Content-Type: application/json' -d '{ "nameFirst": "Brandon" }' http://localhost:8888/_ah/api/personendpoint/v1/person
 *
 * list
 * curl http://localhost:8888/_ah/api/personendpoint/v1/person
 */
@PersistenceCapable
public class Person {

  private static final Logger logger = Logger.getLogger(Person.class.getName());
  
  @PrimaryKey
  @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
  private Long id;

  @Persistent
  private String nameFirst;

  @Persistent
  private String nameLast;

  @Persistent
  private HashSet<String> search;

  public Person() {
  }
  
  public void setLongId(Long id) {
    this.id = id;
  }
  public Long getId() {
    return id;
  }

  public void setNameFirst(String nameFirst) {
    this.nameFirst = nameFirst;
  }
  public String getNameFirst() {
    return nameFirst;
  }

  public void setNameLast(String nameLast) {
    this.nameLast = nameLast;
  }
  public String getNameLast() {
    return nameLast;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("id=" + id + ",");
    return sb.toString();
  }

  protected void createSearch() {
    HashSet<String> hs = new HashSet<String>();

    if (nameLast != null) {
      String ln = nameLast;
      if (ln != null && ln.trim().length() > 0) {
        hs.add(ln.toLowerCase());

        if (ln.length() > 1) {

          for (int i=1; i < ln.length(); i++) {
            String s = ln.substring(0, i);
            hs.add(s.toLowerCase());
          }
        }
      }
    }

    if (nameFirst != null) {
      String fn = nameFirst;
      if (fn != null && fn.trim().length() > 0) {
        hs.add(fn.toLowerCase());

        if (fn.length() > 1) {
          for (int i=1; i < fn.length(); i++) {
            String s = fn.substring(0, i);
            hs.add(s.toLowerCase());
          }
        }
      }
    }
    search = hs;
  }
  
}
