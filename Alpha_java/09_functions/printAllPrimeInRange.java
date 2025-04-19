public class printAllPrimeInRange {

    public static void printprime(int n) {
        int sum =0;

        for(int i=2;i<=n;i++){         
            if(isPrime(i)==true ){
                System.out.print(" "+i);
            }
            if(isPrime(i)==true){
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("the sum is :"+sum);
    }
    public static void sumprime() {
        int sum=0;

        
    }
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        if(n==2){
           return true;
        }
        for(int i =2 ; i<=Math.sqrt(n); i++){
            if(n%i==0){ //completely divisible
                return false;

            }

        }
        return true;
    }
    public static void main(String[] args) {
        int range=10;
        printprime(range);


    }
}
