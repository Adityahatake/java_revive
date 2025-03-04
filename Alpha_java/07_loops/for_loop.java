import java.util.*;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax :
        // for(initialiazation;condition;updation)
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // taking imput from the user
        System.out.print("Enter the Range for the 'For_Loop' : ");
        int range = sc.nextInt();
        for (int i = 1; i <= range; i++) {
            System.out.println("counter  count : " + i);
        }
        sc.close();
    }
}
