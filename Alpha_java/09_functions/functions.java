import java.util.*;

public class functions{
    public static void printHelloWorld() {
        System.out.println("Hello World ... !");
        System.out.println("Hello World ... !");
        System.out.println("Hello World ... !");
        
    }
    public static void calculateSum() {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("The sumof the given numbers is : "+sum);
        sc.close();

        
    }

    public static void main(String[] args) {
        System.out.println("First call");
        printHelloWorld();
        System.out.println("Second call");
        printHelloWorld();
        System.out.println("calling hte calculateSum function ...");
        calculateSum();
    }
}