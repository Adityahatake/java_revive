import java.util.*;

public class while_Loops {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            System.out.println(x + " Hello World...!");
            x++;
        }

        // taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(range for the 'while_loop'): ");
        int range = sc.nextInt();

        int count = 1;
        while (count <= range) {
            System.out.println("counter  count : " + count);
            count++;
        }
        sc.close();
    }
}