public class power_opt{
    // complexity : O(logn)
    public static void main(String[] args) {
        System.out.println(opt_power(2, 5));
        
    }
    public static int opt_power(int x , int n) {
        if(n==0){
            return 1;
        }
        int halfpower=opt_power(x, n/2);                
        
        if(n%2==0){ //if n is even
            return halfpower*halfpower;
        }else{//if n is odd
            return x*halfpower*halfpower;
        }
    }
}