// Defining an interface
interface Janvar {
    void makeSound(); // Abstract method
}

// Implementing the interface
class Kutta implements Janvar {
    
    public void makeSound() {
        System.out.println("Kutta bhokta h ...");
    }
}

// Another class implementing the interface
class Billi implements Janvar {
    
    public void makeSound() {
        System.out.println("Billi meow meow karti h...");
        System.out.println("billi mosi bhi hoti h ");
        System.out.println("mosi toh maa jaisi hoti h");
        System.out.println("billi maiya ki jai...");
    }
}

// Main class
public class Abstraction_java {
    public static void main(String[] args) {
        Janvar myKutta = new Kutta();
        myKutta.makeSound();

        Janvar myBilli = new Billi();
        myBilli.makeSound();
    }
}
