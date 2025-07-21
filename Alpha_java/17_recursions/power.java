public class power {
    public static void main(String[] args) {
        System.out.println(recPow(2, 3));
    }
    public static int recPow(int x, int n) {
        // if(n==0){ also valid
        //     return 1;
        // }
        if(n==1){
            return x;
        }
        return x*recPow(x, n-1);
    }
}
