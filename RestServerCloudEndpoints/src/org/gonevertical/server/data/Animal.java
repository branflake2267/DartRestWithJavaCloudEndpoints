package org.gonevertical.server.data;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * insert
 * curl -H 'Content-Type: application/json' -d '{ "name": "Koa" }' http://localhost:8888/_ah/api/animalendpoint/v1/animal
 *
 * list
 * curl http://localhost:8888/_ah/api/animalendpoint/v1/animal
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Animal {
  
  @PrimaryKey
  @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
  private Long id;
  
  @Persistent
  private String name;

  public Animal() {
  }
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("id=" + id + ",");
    sb.append("nameFirst=" + name);
    return sb.toString();
  }
  
}
