public class sumOfN_numbers {
    public static void main(String[] args) {
       System.out.println(sumofN(6));
    }
    public static int sumofN(int n) {
        int sum=0;
        if(n==1){
            sum=sum+1;
            return sum;
        }else{
           return n+sumofN(n-1);
        }
    }
}
