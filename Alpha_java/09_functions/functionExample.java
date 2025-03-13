// Java program demonstrating different types of functions (methods)
public class functionExample {

    // 1. Non-parameterized function (no parameters, no return type)
    void greet() {
        System.out.println("Hello! Welcome to Java functions.");
    }

    // 2. Parameterized function (takes parameters, no return type)
    void displayMessage(String message) {
        System.out.println("Message: " + message);
    }

    // 3. Function with return type (returns an integer)
    int add(int a, int b) {
        return a + b;  // Returns sum of a and b
    }

    // 4. Function with multiple parameters and return type
    double calculateArea(double radius) {
        return Math.PI * radius * radius;  // Returns area of circle
    }

    // 5. Static function (can be called without object creation)
    static void staticFunction() {
        System.out.println("This is a static function.");
    }

    // 6. Function calling another function
    void callAnotherFunction() {
        System.out.println("Calling another function...");
        greet();  // Calling greet() method
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object to access non-static methods
        functionExample obj = new functionExample();

        // Calling functions
        obj.greet();
        obj.displayMessage("Java is awesome!");
        int sum = obj.add(5, 10);
        System.out.println("Sum: " + sum);
        double area = obj.calculateArea(7);
        System.out.println("Area of circle: " + area);
        obj.callAnotherFunction();

        // Calling static function without object
        functionExample.staticFunction();
    }
}
