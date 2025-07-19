public class nth_Fibonaccci {
    public static void main(String[] args) {
        System.out.println(fibonacccinum(50));
    }
    public static int fibonacccinum(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacccinum(n-1) + fibonacccinum(n-2);
    }
}
