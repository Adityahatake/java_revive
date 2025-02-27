public class java_Operators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators:");

        int a = 12, b = 3;
        System.out.println("Sum of a and b: " + (a + b));
        System.out.println("Difference of a and b: " + (a - b));
        System.out.println("Product of a and b: " + (a * b));
        System.out.println("Quotient of a and b: " + (a / b));
        System.out.println("Remainder of a divided by b: " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // equal to
        System.out.println("a != b: " + (a != b)); // not equal to
        System.out.println("a > b: " + (a > b)); // greater than
        System.out.println("a < b: " + (a < b)); // less than
        System.out.println("a >= b: " + (a >= b)); // greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // less than or equal to

        System.out.println("\nLogical Operators:");
        System.out.println("a == 12 && b < 6: " + (a == 12 && b < 6)); // AND operator

        System.out.println("\nUnary Operators:");
        int c = 12;
        c++; // increment
        System.out.println("After increment: " + c);
        c--; // decrement
        System.out.println("After decrement: " + c);

        System.out.println("\nTernary Operator:");
        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise Operators: & | ^ ~ << >>");

        System.out.println("\nAssignment Operators:");
        int w = 10, x = 20, y = 30, z = 40;
        w += 12;
        x -= 10;
        y *= 10;
        z /= 10;

        System.out.println("Updated value of w: " + w);
        System.out.println("Updated value of x: " + x);
        System.out.println("Updated value of y: " + y);
        System.out.println("Updated value of z: " + z);
    }
}
