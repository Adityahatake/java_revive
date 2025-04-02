public class binomial_Cofficient {

    
    public static int factorial(int n) {
        int fact=1; 
        for(int i =1 ; i<=n; i++){
            fact = fact*i;
        }
        return fact;  
    }
    public static int binocoff(int n , int r) {
       //formula : n!/r!(n-r)!
       int n_fact = factorial(n) ;
       int r_fact = factorial(r); 
       int nr_fact = factorial(n-r);
       int formula = n_fact / (r_fact * nr_fact);

        return formula ;
    }
    public static void main(String[] args) {
        int n = 5; 
        int r=2;
        int value = binocoff(n, r);
        System.out.println("the binomial cofficient will be:" +value);
    }
}
