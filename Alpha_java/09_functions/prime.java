import java.util.Scanner;
public class prime {
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        if(n==2){
           return true;
        }
        for(int i =2 ; i<=Math.sqrt(n); i++){
            if(n%i==0){ //completely divisible
                return false;

            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not (true or false): ");
        int n =sc.nextInt();
        boolean check = isPrime(n);
        System.out.println(check);
        sc.close();

    }
}
