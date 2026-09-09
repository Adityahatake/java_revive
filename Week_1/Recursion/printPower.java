public class printPower {
    public static void main(String[] args) {
        System.out.println(power(2,10 ));
    }
    public static int power(int x , int n) {
        //base case
        if(n==0){
            return 1;
        }
        // recursive case
        return x* power(x, n-1);
       
    }
}
