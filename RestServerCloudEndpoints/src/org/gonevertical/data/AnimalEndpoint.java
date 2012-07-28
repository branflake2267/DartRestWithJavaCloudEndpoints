package org.gonevertical.data;

import org.gonevertical.data.PMF;

import com.google.api.server.spi.config.Api;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

@Api(name = "animalendpoint")
public class AnimalEndpoint {

  /**
   * This method lists all the entities inserted in datastore.
   * It uses HTTP GET method.
   *
   * @return List of all entities persisted.
   */
  @SuppressWarnings({"cast", "unchecked"})
  public List<Animal> listAnimal() {
    PersistenceManager mgr = getPersistenceManager();
    List<Animal> result = new ArrayList<Animal>();
    try{
      Query query = mgr.newQuery(Animal.class);
      for (Object obj : (List<Object>) query.execute()) {
        result.add(((Animal) obj));
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
  public Animal getAnimal(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
    Animal animal  = null;
    try {
      animal = mgr.getObjectById(Animal.class, id);
    } finally {
      mgr.close();
    }
    return animal;
  }

  /**
   * This inserts the entity into App Engine datastore.
   * It uses HTTP POST method.
   *
   * @param animal the entity to be inserted.
   * @return The inserted entity.
   */
  public Animal insertAnimal(Animal animal) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mgr.makePersistent(animal);
    } finally {
      mgr.close();
    }
    return animal;
  }

  /**
   * This method is used for updating a entity.
   * It uses HTTP PUT method.
   *
   * @param animal the entity to be updated.
   * @return The updated entity.
   */
  public Animal updateAnimal(Animal animal) {
    PersistenceManager mgr = getPersistenceManager();
    try {
      mgr.makePersistent(animal);
    } finally {
      mgr.close();
    }
    return animal;
  }

  /**
   * This method removes the entity with primary key id.
   * It uses HTTP DELETE method.
   *
   * @param id the primary key of the entity to be deleted.
   * @return The deleted entity.
   */
  public Animal removeAnimal(@Named("id") Long id) {
    PersistenceManager mgr = getPersistenceManager();
     Animal animal  = null;
    try {
      animal = mgr.getObjectById(Animal.class, id);
      mgr.deletePersistent(animal);
    } finally {
      mgr.close();
    }
    return animal;
  }

  private static PersistenceManager getPersistenceManager() {
    return PMF.get().getPersistenceManager();
  }

}
