// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

// Child class overriding the makeSound() method
class Dog extends Animal {
    @Override //not important to write "@Override"
    public void makeSound() {
        System.out.println("Dog barks...");
    }
}

// Another child class
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows...");
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls Animal's method

        Dog myDog = new Dog();
        myDog.makeSound(); // Calls overridden method in Dog

        Cat myCat = new Cat();
        myCat.makeSound(); // Calls overridden method in Cat
    }
}
