// Encapsulation: Hiding data using private access modifiers
class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main classEx
public class Encapsulation {
    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student("John", 20);

        // Display initial values
        student.display();

        // Modifying values using setters
        student.setName("Alice");
        student.setAge(22);

        // Display updated values
        student.display();
    }
}
