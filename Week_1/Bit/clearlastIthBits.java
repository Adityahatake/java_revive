public class clearlastIthBits {
    public static void main(String[] args) {
        System.out.println(clithbits(5,2));
        System.out.println(clirangebits(10, 2, 4));
    }
    public static int clithbits(int n , int i ) {
       int bitmask=(~0)<<i;
       return n &bitmask; 
    }

    public static int clirangebits(int n , int i , int j) {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
       int bitmask=a|b;
       return n &bitmask; 

    }

}
