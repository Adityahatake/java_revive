public class clearlastIthBits {
    public static void main(String[] args) {
        System.out.println(clithbits(5,2));
    }
    public static int clithbits(int n , int i ) {
       int bitmask=(~0)<<i;
       return n &bitmask; 
    }
}
