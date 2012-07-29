#import('/Users/branflake2267/workspace-sdk/dart-sdk/lib/unittest/unittest.dart');
#import("../data/person.dart");
#import("dart:json");

String json = """{
  "id" : 1,
  "nameFirst" : "Brandon",
  "nameLast" : "Donnelson"
}""";

void main() {
  Person person = new Person.fromJson(json);

  test('test json mapping id', () => expect(person.id, 1));
  test('test json mapping first name', () => expect(person.nameFirst, "Brandon"));
  test('test json mapping last name', () => expect(person.nameLast, "Donnelson"));

  String expectJson = '{"nameFirst":"Brandon","id":1,"nameLast":"Donnelson"}';
  String tojson = person.json;
  test('test person tojson', () => expect(person.json, expectJson));

}
