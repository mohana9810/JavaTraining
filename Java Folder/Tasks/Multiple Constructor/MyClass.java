public class MyClass {
private int intValue;
private String stringValue;

public MyClass() {
this.intValue = 0;
this.stringValue = "Default";
}

public MyClass(int intValue) {
this.intValue = intValue;
this.stringValue = "CustomValue";
}

public MyClass(int intValue, String stringValue) {
this.intValue = intValue;
this.stringValue = stringValue;

}

public void display() {
System.out.println("Int Value: " + intValue);
System.out.println("String Value: " + stringValue);
}
public static void main(String[] args) {

MyClass obj1 = new MyClass();
MyClass obj2 = new MyClass(42);
MyClass obj3 = new MyClass(99, "Hello");

System.out.println("Object 1:");
obj1.display();
System.out.println("\nObject 2:");
obj2.display();
System.out.println("\nObject 3:");
obj3.display();
}
}