/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file was generated.
 *  with google-apis-code-generator 1.1.1 (build: 2012-08-20 15:19:57 UTC)
 *  on 2012-08-27 at 05:28:08 UTC 
 */

package com.appspot.api.services.animalendpoint;


import com.google.api.client.googleapis.services.GoogleClient;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpRequest;
import com.google.api.client.http.json.JsonHttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

import java.io.IOException;


/**
 * Service definition for Animalendpoint (v1).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link JsonHttpRequestInitializer} to initialize global parameters via its
 * {@link Builder}. Sample usage:
 * </p>
 *
 * <pre>
  public class AnimalendpointRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        AnimalendpointRequest animalendpointRequest = (AnimalendpointRequest)request;
        animalendpointRequest.setPrettyPrint(true);
        animalendpointRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Animalendpoint extends GoogleClient {

  /**
   * The default encoded base path of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.8) Use "/" + {@link #DEFAULT_SERVICE_PATH}.
   */
  @Deprecated
  public static final String DEFAULT_BASE_PATH = "/_ah/api/animalendpoint/v1/";

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://democloudpoint.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "animalendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Construct a Animalendpoint instance to connect to the Animalendpoint service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to be removed in 1.8) Use
   *             {@link #Animalendpoint(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
  @Deprecated
  public Animalendpoint(HttpTransport transport, JsonFactory jsonFactory) {
    super(transport, jsonFactory, DEFAULT_BASE_URL);
  }

  /**
   * Construct a Animalendpoint instance to connect to the Animalendpoint service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Animalendpoint(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
  }

  /**
   * Construct a Animalendpoint instance to connect to the Animalendpoint service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param baseUrl The base URL of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  @Deprecated
  Animalendpoint(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String baseUrl,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          baseUrl,
          applicationName);
  }

  /**
   * Construct a Animalendpoint instance to connect to the Animalendpoint service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param rootUrl The root URL of the service on the server
   * @param servicePath The service path of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  Animalendpoint(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String rootUrl,
      String servicePath,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          rootUrl,
          servicePath,
          applicationName);
  }

  @Override
  protected void initialize(JsonHttpRequest jsonHttpRequest) throws IOException {
    super.initialize(jsonHttpRequest);
  }


  /**
   * Returns an instance of a new builder.
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to removed in 1.8) Use
   *             {@link Builder#Builder(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
   @Deprecated
   public static Builder builder(HttpTransport transport, JsonFactory jsonFactory) {
     return new Builder(transport, jsonFactory, new GenericUrl(DEFAULT_BASE_URL));
   }


  /**
   * Create a request for the method "listAnimal".
   *
   * This request holds the parameters needed by the the animalendpoint server.  After setting any
   * optional parameters, call the {@link ListAnimal#execute()} method to invoke the remote operation.
   *
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public ListAnimal listAnimal() throws IOException {
    ListAnimal result = new ListAnimal();
    initialize(result);
    return result;
  }


  public class ListAnimal extends AnimalendpointRequest {

    private static final String REST_PATH = "animal";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    ListAnimal() {
      super(Animalendpoint.this, HttpMethod.GET, REST_PATH, null);
    }



    /**
     * Sends the "listAnimal" request to the Animalendpoint server.
     *
     * @return the {@link com.appspot.api.services.animalendpoint.model.Animals} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.animalendpoint.model.Animals execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.animalendpoint.model.Animals result = response.parseAs(
          com.appspot.api.services.animalendpoint.model.Animals.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "listAnimal" request to the Animalendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Animals&gt;() {

         public void onSuccess(Animals content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.animalendpoint.model.Animals> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.animalendpoint.model.Animals.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public ListAnimal setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }

  /**
   * Create a request for the method "insertAnimal".
   *
   * This request holds the parameters needed by the the animalendpoint server.  After setting any
   * optional parameters, call the {@link InsertAnimal#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.animalendpoint.model.Animal}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public InsertAnimal insertAnimal(com.appspot.api.services.animalendpoint.model.Animal content) throws IOException {
    InsertAnimal result = new InsertAnimal(content);
    initialize(result);
    return result;
  }


  public class InsertAnimal extends AnimalendpointRequest {

    private static final String REST_PATH = "animal";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    InsertAnimal(com.appspot.api.services.animalendpoint.model.Animal content) {
      super(Animalendpoint.this, HttpMethod.POST, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }



    /**
     * Sends the "insertAnimal" request to the Animalendpoint server.
     *
     * @return the {@link com.appspot.api.services.animalendpoint.model.Animal} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.animalendpoint.model.Animal execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.animalendpoint.model.Animal result = response.parseAs(
          com.appspot.api.services.animalendpoint.model.Animal.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "insertAnimal" request to the Animalendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Animal&gt;() {

         public void onSuccess(Animal content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.animalendpoint.model.Animal> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.animalendpoint.model.Animal.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public InsertAnimal setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }

  /**
   * Create a request for the method "removeAnimal".
   *
   * This request holds the parameters needed by the the animalendpoint server.  After setting any
   * optional parameters, call the {@link RemoveAnimal#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public RemoveAnimal removeAnimal(String id) throws IOException {
    RemoveAnimal result = new RemoveAnimal(id);
    initialize(result);
    return result;
  }


  public class RemoveAnimal extends AnimalendpointRequest {

    private static final String REST_PATH = "animal/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    RemoveAnimal(String id) {
      super(Animalendpoint.this, HttpMethod.DELETE, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }



    /**
     * Sends the "removeAnimal" request to the Animalendpoint server.
     *
     * @return the {@link com.appspot.api.services.animalendpoint.model.Animal} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.animalendpoint.model.Animal execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.animalendpoint.model.Animal result = response.parseAs(
          com.appspot.api.services.animalendpoint.model.Animal.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "removeAnimal" request to the Animalendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Animal&gt;() {

         public void onSuccess(Animal content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.animalendpoint.model.Animal> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.animalendpoint.model.Animal.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public RemoveAnimal setFields(String fields) {
      super.setFields(fields);
      return this;
    }


    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }


    public RemoveAnimal setId(String id) {
      this.id = id;
      return this;
    }



  }

  /**
   * Create a request for the method "getAnimal".
   *
   * This request holds the parameters needed by the the animalendpoint server.  After setting any
   * optional parameters, call the {@link GetAnimal#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public GetAnimal getAnimal(String id) throws IOException {
    GetAnimal result = new GetAnimal(id);
    initialize(result);
    return result;
  }


  public class GetAnimal extends AnimalendpointRequest {

    private static final String REST_PATH = "animal/{id}";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    GetAnimal(String id) {
      super(Animalendpoint.this, HttpMethod.GET, REST_PATH, null);
      this.id = Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }



    /**
     * Sends the "getAnimal" request to the Animalendpoint server.
     *
     * @return the {@link com.appspot.api.services.animalendpoint.model.Animal} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.animalendpoint.model.Animal execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.animalendpoint.model.Animal result = response.parseAs(
          com.appspot.api.services.animalendpoint.model.Animal.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "getAnimal" request to the Animalendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Animal&gt;() {

         public void onSuccess(Animal content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.animalendpoint.model.Animal> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.animalendpoint.model.Animal.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public GetAnimal setFields(String fields) {
      super.setFields(fields);
      return this;
    }


    @com.google.api.client.util.Key
    private String id;

    /**

     */
    public String getId() {
      return id;
    }


    public GetAnimal setId(String id) {
      this.id = id;
      return this;
    }



  }

  /**
   * Create a request for the method "updateAnimal".
   *
   * This request holds the parameters needed by the the animalendpoint server.  After setting any
   * optional parameters, call the {@link UpdateAnimal#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.api.services.animalendpoint.model.Animal}
   * @return the request
   * @throws IOException if the initialization of the request fails
   */
  public UpdateAnimal updateAnimal(com.appspot.api.services.animalendpoint.model.Animal content) throws IOException {
    UpdateAnimal result = new UpdateAnimal(content);
    initialize(result);
    return result;
  }


  public class UpdateAnimal extends AnimalendpointRequest {

    private static final String REST_PATH = "animal";

    /**
     * Internal constructor.  Use the convenience method instead.
     */
    UpdateAnimal(com.appspot.api.services.animalendpoint.model.Animal content) {
      super(Animalendpoint.this, HttpMethod.PUT, REST_PATH, content);
      Preconditions.checkNotNull(content);
    }



    /**
     * Sends the "updateAnimal" request to the Animalendpoint server.
     *
     * @return the {@link com.appspot.api.services.animalendpoint.model.Animal} response
     * @throws IOException if the request fails
     */
    public com.appspot.api.services.animalendpoint.model.Animal execute() throws IOException {
      HttpResponse response = executeUnparsed();
      com.appspot.api.services.animalendpoint.model.Animal result = response.parseAs(
          com.appspot.api.services.animalendpoint.model.Animal.class);
      result.setResponseHeaders(response.getHeaders());
      return result;
    }

    /**
     * Queues the "updateAnimal" request to the Animalendpoint server into the given batch request.
     *
     * <p>
     * Example usage:
     * </p>
     *
     * <pre>
       request.queue(batchRequest, new JsonBatchCallback&lt;Animal&gt;() {

         public void onSuccess(Animal content, GoogleHeaders responseHeaders) {
           log("Success");
         }

         public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
           log(e.getMessage());
         }
       });
     * </pre>
     *
     * @param batch a single batch of requests
     * @param callback batch callback
     * @since 1.6
     */
    public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
        com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.animalendpoint.model.Animal> callback)
        throws IOException {
      batch.queue(buildHttpRequest(), com.appspot.api.services.animalendpoint.model.Animal.class,
          com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
    }

    /**
     * @since 1.7
     */
    @Override
    public UpdateAnimal setFields(String fields) {
      super.setFields(fields);
      return this;
    }



  }


  /**
   * Builder for {@link Animalendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends GoogleClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param baseUrl The base URL of the service. Must end with a "/"
     */
    @Deprecated
    Builder(HttpTransport transport, JsonFactory jsonFactory, GenericUrl baseUrl) {
      super(transport, jsonFactory, baseUrl);
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
    }

    /** Builds a new instance of {@link Animalendpoint}. */
    @SuppressWarnings("deprecation")
    @Override
    public Animalendpoint build() {
      if (isBaseUrlUsed()) {
        return new Animalendpoint(
            getTransport(),
            getJsonHttpRequestInitializer(),
            getHttpRequestInitializer(),
            getJsonFactory(),
            getObjectParser(),
            getBaseUrl().build(),
            getApplicationName());
      }
      return new Animalendpoint(
          getTransport(),
          getJsonHttpRequestInitializer(),
          getHttpRequestInitializer(),
          getJsonFactory(),
          getObjectParser(),
          getRootUrl(),
          getServicePath(),
          getApplicationName());
    }

    @Override
    @Deprecated
    public Builder setBaseUrl(GenericUrl baseUrl) {
      super.setBaseUrl(baseUrl);
      return this;
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      super.setRootUrl(rootUrl);
      return this;
    }

    @Override
    public Builder setServicePath(String servicePath) {
      super.setServicePath(servicePath);
      return this;
    }

    @Override
    public Builder setJsonHttpRequestInitializer(
        JsonHttpRequestInitializer jsonHttpRequestInitializer) {
      super.setJsonHttpRequestInitializer(jsonHttpRequestInitializer);
      return this;
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      super.setHttpRequestInitializer(httpRequestInitializer);
      return this;
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      super.setApplicationName(applicationName);
      return this;
    }

    @Override
    public Builder setObjectParser(JsonObjectParser parser) {
      super.setObjectParser(parser);
      return this;
    }
  }
}
