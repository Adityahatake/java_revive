public class function_Overloading {

    public static int sum(int a , int b) {
        return a+b; 
        
    }
    public static int sum(int a , int b , int c) {
        return a+b+c; 
        
    }
    public static int sum(int a , int b , int c, int d ) {
        return a+b+c+d; 
        
    }
    public static void main(String[] args) {
        System.out.println("test statement!");
        int sum1=sum(1,2);
        int sum2=sum(1,2,3);
        int sum3=sum(1,2,3,4);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
         
    }
}
