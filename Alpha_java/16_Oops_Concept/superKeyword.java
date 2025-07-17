// The super keyword is used to refer to the immediate parent class — for:
// Accessing parent class methods.
// Accessing parent class constructors.
// Accessing parent class variables.

public class superKeyword {

   public static void main(String[] args) {
        Child obj = new Child(); 
        obj.showNames();
        obj.display();
    }
}
class Parent {
    String name = "Parent";

    void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    String name = "Child";

    void showNames() {
        System.out.println("Name in Child: " + name);
        System.out.println("Name in Parent: " + super.name); // access parent variable
    }

    void display() {
        super.display(); // calling parent method
        System.out.println("Display from Child");
    }
}