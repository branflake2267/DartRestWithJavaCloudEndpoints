#library("person");

#import("dart:json");

class Person {
  int id;
  String nameFirst;
  String nameLast;

  Person.fromJson(String json) {
    Map<String, Object> map = JSON.parse(json);
    id = map['id'];
    nameFirst = map['nameFirst'];
    nameLast = map['nameLast'];
  }

  String get json() {
    return JSON.stringify(toMap());
  }

  Map<String, Object> toMap() {
    Map<String, Object> map = new Map<String, Object>();
    map["id"] = id;
    map["nameFirst"] = nameFirst;
    map["nameLast"] = nameLast;
    return map;
  }
}
