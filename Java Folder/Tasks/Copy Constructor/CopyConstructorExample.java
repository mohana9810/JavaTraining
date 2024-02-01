class Person {
String name;
int age;
public Person(String name, int age) {
this.name = name;
this.age = age;
}
public Person(Person other) {
name = other.name;
age = other.age;
}
public void displayDetails() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}
public class CopyConstructorExample {
public static void main(String[] args) {
Person person1 = new Person("John", 25);
Person person2 = new Person(person1);
System.out.println("Person 1 details:");
person1.displayDetails();
System.out.println("\nPerson 2 details (copied from Person 1):");
person2.displayDetails();
}
}