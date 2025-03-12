import java.util.Scanner;

public class sum_And_Mul_func {

    public static void mul(Scanner sc) {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The multiplication of the given numbers is: " + (a * b));
    }

    public static void sum(Scanner sc) {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The sum of the given numbers is: " + (a + b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Open scanner once
        sum(sc);
        mul(sc);
        sc.close(); // Close scanner at the end
    }
}
