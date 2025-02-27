// Engine class (dependent)
class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println( type + " Engine   is starting...");
    }
}

// Car class (owns Engine)
class Car {
    String model;
    Engine engine; // Composition (Car has an Engine)

    public Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType); // Engine is created inside Car
    }

    public void startCar() {
        System.out.println("Car " + model + " is starting...");
        engine.start(); // Car uses its Engine
    }
}

// Main class
public class Composition {
    public static void main(String[] args) {
        // Creating a car with an engine
        Car car1 = new Car("Tesla Model S", "Electric");

        // Start the car
        car1.startCar();
    }
}
