public class java_Operators {
    public static void main(String[] args) {
        // Section: Arithmetic Operators
        System.out.println("Arithmetic Operators:");
      
        // Initialize two integer variables
         int a = 12, b = 3; 

        // Addition
        System.out.println("Sum of a and b: " + (a + b)); // Calculates and prints the sum of a and b

        // Subtraction
        System.out.println("Difference of a and b: " + (a - b)); // Calculates and prints the difference of a and b

        // Multiplication
        System.out.println("Product of a and b: " + (a * b)); // Calculates and prints the product of a and b

        // Division
        System.out.println("Quotient of a and b: " + (a / b)); // Calculates and prints the quotient of a divided by b

        // Modulus (Remainder)
        System.out.println("Remainder of a divided by b: " + (a % b)); // Calculates and prints the remainder of a divided by b

        // Section: Relational Operators
        System.out.println("\nRelational Operators:");

        // Equal to
        System.out.println("a == b: " + (a == b)); // Checks if a is equal to b and prints the result (true or false)

        // Not equal to
        System.out.println("a != b: " + (a != b)); // Checks if a is not equal to b and prints the result

        // Greater than
        System.out.println("a > b: " + (a > b)); // Checks if a is greater than b and prints the result

        // Less than
        System.out.println("a < b: " + (a < b)); // Checks if a is less than b and prints the result

        // Greater than or equal to
        System.out.println("a >= b: " + (a >= b)); // Checks if a is greater than or equal to b and prints the result

        // Less than or equal to
        System.out.println("a <= b: " + (a <= b)); // Checks if a is less than or equal to b and prints the result

        // Section: Logical Operators
        System.out.println("\nLogical Operators:");

        // Logical AND (&&)
        System.out.println("a == 12 && b < 6: " + (a == 12 && b < 6)); // Checks if both conditions are true and prints the result

        // Section: Unary Operators
        System.out.println("\nUnary Operators:");

        int c = 12; // Initialize an integer variable

        // Increment (post-increment)
        c++; // Increments the value of c by 1
        System.out.println("After increment: " + c); // Prints the updated value of c

        // Decrement (post-decrement)
        c--; // Decrements the value of c by 1
        System.out.println("After decrement: " + c); // Prints the updated value of c

        // Section: Ternary Operator
        System.out.println("\nTernary Operator:");

        // Ternary operator to find minimum value
        int min = (a < b) ? a : b; // Assigns the smaller value between a and b to min
        int max = (a > b) ? a : b; // Assigns the larger value between a and b to max

        System.out.println("Minimum value: " + min); // Prints the minimum value
        System.out.println("Maximum value: " + max); // Prints the maximum value

        // Section: Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise Operators: & | ^ ~ << >>"); // Lists the bitwise operators

        // Section: Assignment Operators
        System.out.println("\nAssignment Operators:");

        int w = 10, x = 20, y = 30, z = 40; // Initialize multiple integer variables

        // Addition assignment (w = w + 12)
        w += 12; // Adds 12 to w and assigns the result to w

        // Subtraction assignment (x = x - 10)
        x -= 10; // Subtracts 10 from x and assigns the result to x

        // Multiplication assignment (y = y * 10)
        y *= 10; // Multiplies y by 10 and assigns the result to y

        // Division assignment (z = z / 10)
        z /= 10; // Divides z by 10 and assigns the result to z

        System.out.println("Updated value of w: " + w); // Prints the updated value of w
        System.out.println("Updated value of x: " + x); // Prints the updated value of x
        System.out.println("Updated value of y: " + y); // Prints the updated value of y
        System.out.println("Updated value of z: " + z); // Prints the updated value of z
    }
}