// Parent class
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking...");
    }
}

// Main class
public class Inheritance{
    public static void main(String[] args) {
        // Creating an object of Dog
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        // Accessing methods from Parent and Child class
        myDog.eat();  // Inherited method
        myDog.sleep();  // Inherited method
        myDog.bark();  // Child class method
    }
}

