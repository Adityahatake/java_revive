import java.util.Scanner;
public class prime {

    public static boolean isprime(int n) {
        boolean isprime =true;
        if(n==2){
            isprime=true;
        }
        for(int i =2 ; i<Math.sqrt(n); i++){
            if(n%i==0){
                isprime=false;
            }

        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not (true or false): ");
        int n =sc.nextInt();
        boolean check = isprime(n);
        System.out.println(check);

    }
}
