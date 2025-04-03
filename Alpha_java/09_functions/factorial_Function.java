public class factorial_Function {
    public static int factorial(int n) {
        int fact=1; 
        for(int i =1 ; i<=n; i++){
            fact = fact*i;
        }
        return fact; 
    }
    public static void main(String[] args) {

        int n =4;
        int fact = factorial( n);
        System.out.println("the factorial of the given value is: "+fact);
    }
    
}
