
#import('dart:html');
#import('./rest/Request.dart');


void main() {

  String url = "http://www.html5rocks.com/en/tutorials/file/xhr2/";
  Request request = new Request.send(url, test);
  
  
}

void test(String s) {
  print(s);
}