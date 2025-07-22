public class power_opt{
    // complexity : O(logn)
    public static void main(String[] args) {
        System.out.println(opt_power(2, 4));
        
    }
    public static int opt_power(int x , int n) {
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return opt_power(x, n/2)*opt_power(x, n/2);
        }else{
            return x*opt_power(x, n/2)*opt_power(x, n/2);
        }
    }
}