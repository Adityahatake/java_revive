import java.util.*;

public class largest_Of_Two {
    public static void main(String[] args) {
        System.out.println("Test statement");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int b = sc.nextInt();
        int lar = (a > b) ? a : b;
        System.out.println(lar + " is the largest number.. ");
    }
}
