package org.gonevertical.server;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;

public class PersonEndpointTest extends TestUtils {

  @Test
  public void testList() {
    String content = getRequest("http://localhost:8888/_ah/api/personendpoint/v1/person/list");
    assertTrue(content.contains("\"items\" :"));
  }
    
  @Test
  public void testInsert() {
    String url = "http://localhost:8888/_ah/api/personendpoint/v1/person/insert";
    String json = "{ \"nameFirst\": \"Brandon\", \"nameLast\": \"Donnelson\" }";
    String content = postRequest(url, json);
    assertTrue(content.contains("\"id\" :"));
  }
  
  @Test
  public void testGet() {
    String url = "http://localhost:8888/_ah/api/personendpoint/v1/person/get/1";
    String content = getRequest(url);
    assertTrue(content.contains("\"id\" :"));
  }
  
  @Test
  public void testUpdate() {
    String url = "http://localhost:8888/_ah/api/personendpoint/v1/person/insert";
    String json = "{ \"nameFirst\": \"Brandon\" }";
    String content = postRequest(url, json);
    
    JSONObject jso = null;
    try {
      jso = new JSONObject(content);
    } catch (JSONException e) {
      e.printStackTrace();
      fail();
    }
    
    url = "http://localhost:8888/_ah/api/personendpoint/v1/person/update";
    try {
      jso.put("nameLast", "Donnelson");
    } catch (JSONException e1) {
      e1.printStackTrace();
      fail();
    }
    
    json = jso.toString();
    
    content = postRequest(url, json);
    
    try {
      JSONObject jso2 = new JSONObject(content);
      String nameFirst = jso2.getString("nameFirst");
      String nameLast = jso2.getString("nameLast");
      assertEquals("Brandon", nameFirst);
      assertEquals("Donnelson", nameLast);
    } catch (JSONException e) {
      e.printStackTrace();
      fail();
    }
  }
  
  @Test
  public void testSearch() {
    
  }
  
  @Test
  public void testRemove() {
    
  }
  
}
