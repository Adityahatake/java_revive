public class power_OPT {
    public static void main(String[] args) {
        System.out.println(opt(2, 9));
        
    }
    public static int opt(int x , int n) {
        // base case
        if(n==0){
            return 1;
        }
        int half=opt( x , n/2);
        int halfopt=half*half;

        if(n%2!=0){
            halfopt=x*halfopt;
        }

        return halfopt;


        
    }
}
