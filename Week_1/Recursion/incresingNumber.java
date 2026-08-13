public class incresingNumber {
    public static void main(String[] args){
       
        print(0);
    }
    public static void print(int n) {
          //base case
        if(n<=0){
            System.out.println("Bhang piya h kya be !!");
            return;
        }
        if(n==1 ){
            System.out.print(1);
            return;
        }
        
        //recursion
        print(n-1);
        System.out.print(" "+n);
        // 400+30+30 
      
    }

    
}