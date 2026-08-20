public class decresingNumber {
    public static void main(String[] args) {
        print(100);
        
    }
    public static void print(int n) {
        //base case
        if(n==1){
            System.out.println(1);
            

        }else{
                    // recursion
        System.out.print(n+" ");
        print(n-1);
        }


    }
  
}
