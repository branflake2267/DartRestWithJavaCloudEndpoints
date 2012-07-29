#library('Request');

#import('dart:html');
#import("dart:json");

typedef void RequestHandler(String callback);

class Request {
  RequestHandler callback;
  
  Request.send(String url, this.callback) {
    XMLHttpRequest request = new XMLHttpRequest();
    request.open("GET", url, async : true);
    request.on.loadEnd.add((XMLHttpRequestProgressEvent e) => onSuccess(e, request));
    request.send();
  }

  // TODO throw exception 
  void onSuccess(XMLHttpRequestProgressEvent event, XMLHttpRequest request) {
    callback(request.responseText);
  }
  
}