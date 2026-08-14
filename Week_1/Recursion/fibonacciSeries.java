public class fibonacciSeries {
    public static void main(String[] args) {
        //print n fibonacci number
       System.out.println( print(5));
        System.out.println();
        //print fibonacci series
        printseries(5);
    }

    public static int print(int n) {
        //base case 
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        //recursion
       return  print(n-1)+print(n-2);
    }

    public static void printseries(int n) {
        //base case
        for(int i=0;i<=n;i++){
            System.out.print(print(i) +" ");
        } 
    }
}
