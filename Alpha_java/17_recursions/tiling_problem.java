public class tiling_problem {
    public static void main(String[] args) { 
        System.out.println(fill(4)); //here floor size is 2*n
        
    }
        //2*n is floor size
        // 2*1 is tile size

    public static int fill(int n) {
        // base case
        if(n==0||n==1){
            return 1;
        }
        //kaam 
        // vertical choice
        int fn1=fill(n-1);
        //horizontical choice
        int fn2=fill(n-2);
        
        int totways=fn1+fn2;
        return totways;
    }
}
 