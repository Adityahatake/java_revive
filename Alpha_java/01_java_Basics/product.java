import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int a =sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b =sc.nextInt();
        int product=a*b;
        System.out.println("The product of First and Second number is "+product);
        sc.close();
    }
}


