// Base class demonstrating Encapsulation
class Animal {
    private String name;  // Private variable - encapsulation

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Method to be overridden
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Derived class demonstrating Inheritance
class Dog extends Animal {

    public Dog(String name) {
        super(name);  // Calling the constructor of the superclass
    }

    // Overriding method - demonstrating Polymorphism
    
    public void speak() {
        System.out.println(getName() + " barks.");
    }
}

// Main class
public class intro {

    public static void main(String[] args) {
        // Creating an object of Animal
        Animal genericAnimal = new Animal("GenericAnimal");
        genericAnimal.speak();

        // Creating an object of Dog
        Dog dog = new Dog("Buddy");
        dog.speak();  
    }
}
