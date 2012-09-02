package org.gonevertical.server;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PersonEndpointTest extends TestUtils {

  @Test
  public void testList() {
    String content = getRequest("http://localhost:8888/_ah/api/personendpoint/v1/person");
    assertTrue(content.contains("\"items\" :"));
  }
    
  @Test
  public void testInsert() {
    String url = "http://localhost:8888/_ah/api/personendpoint/v1/person";
    String json = "{ \"nameFirst\": \"Brandon\", \"nameLast\": \"Donnelson\" }";
    String content = postRequest(url, json);
    assertTrue(content.contains("\"id\" :"));
  }
  
  @Test
  public void testGet() {
    String url = "http://localhost:8888/_ah/api/personendpoint/v1/person/1";
    String content = getRequest(url);
    assertTrue(content.contains("\"id\" :"));
  }
  
  @Test
  public void testUpdate() {
    
  }
  
  @Test
  public void testSearch() {
    
  }
  
  @Test
  public void testRemove() {
    
  }
  
}
