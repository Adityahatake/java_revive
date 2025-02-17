public class operators {
    public static void main(String[] args) {
        System.out.println("Arthmatic operators:");

        int a = 12;
        int b = 3;

        System.out.println("sum of a and b is: " + (a + b));
        System.out.println("substrract of a and b is: " + (a - b));
        System.out.println("multiply of a and b is: " + (a * b));
        System.out.println("Division of a and b is: " + (a / b));
        System.out.println("Modulo of a with b is: " + (a % b));

        System.out.println("Relational operators: ");
        System.out.println(a == b); // equal to
        System.out.println(a != b); // not equal to
        System.out.println(a > b); // greater than
        System.out.println(a < b); // less than
        System.out.println(a >= b); // greater than equal to
        System.out.println(a <= b); // less than equal to

        System.out.println("logical operator:");
        System.out.println(a == 12 && b < 6); // Output: true

        int c = 12;
        System.out.println("unary operators:");
        c++; // increament
        System.out.println(c);
        c--;// decreament
        System.out.println(c);

        System.out.println("ternary operator:");
        int min = (a < b) ? a : b;
        int max = (a > b) ? a : b;
        System.out.println(min);
        System.out.println(max);

        System.out.println("bitwise operators:");
        System.out.println("Bitwise `&\t^ ~ << >>`"); // operates on the bit level

        System.out.println("assignment operators:");
        int w = 10;
        int x = 20;
        int y = 30;
        int z = 40;
        System.out.println("types of the assigment.....");
        w += 12;
        x -= 10;
        y *= 10;
        z /= 10;

        System.out.println("value of w:" + w);
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
        System.out.println("value of z:" + z);

    }

}
