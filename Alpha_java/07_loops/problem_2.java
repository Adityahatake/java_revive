import java.util.*;
public class problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print a number enter by the user until it is a multiple of 10 
        do {
            System.out.print("Enter a number to print it : ");
            int x =sc.nextInt();

            if(x%10==0){
                break;
            }
            System.out.println("The number you have entered is: "+x);

        } while (true);
    }
}
