public class introductionToArray {

    public static void main(String[] args) {
        
        // Introduction to Arrays in Java

        // 1. Creating an array using 'new' keyword
        int[] marks = new int[3]; // Array of size 3, default values are 0

        // 2. Initializing an array directly with values
        int[] numbers = {1, 2, 3}; // Array with 3 elements

        // 3. String array example
        String[] fruits = {"apple", "mango", "grapes"}; // Array with 3 strings

        // Accessing elements in an array
        System.out.println("Second fruit: " + fruits[1]); // mango

        // Updating elements in an array
        marks[0] = 95;
        marks[1] = 88;
        marks[2] = 76;

        // Printing array elements
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }

        // Trying to access an invalid index will cause an exception
        // Uncommenting the line below will throw ArrayIndexOutOfBoundsException
        // System.out.println(numbers[12]);
    }
}
