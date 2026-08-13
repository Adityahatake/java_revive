public class sumNnumbers {
    public static void main(String[] args) {
        //print sum of n natural numbers
        System.out.println(sum(10));

    }
    public static int sum(int n) {
        //base case
        if(n==1){
            return 1;
        }
        // recursion
        return n+sum(n-1);

    }
}
