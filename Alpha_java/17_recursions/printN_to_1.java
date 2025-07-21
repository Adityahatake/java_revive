// the task here is to print the number from N to 1
public class printN_to_1 {
    public static void main(String[] args) {
        printNtoOne(10);
        
    }
    public static void printNtoOne(int n){
        if(n==1){
            System.out.println(1);
        }else{
             System.out.print(n+" ");
             printNtoOne(n-1);
        }
    }
}
