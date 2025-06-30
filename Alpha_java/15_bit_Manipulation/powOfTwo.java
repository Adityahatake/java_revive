public class powOfTwo {
    
    public static void check_if_pow_of_two(int n) {
        int bitmask=n-1;
        if((n&bitmask)==0){
            System.out.println("It is a power of two");
        }else{
            System.out.println("It is not power of two");
        }
    }
    public static void main(String[] args) {
        check_if_pow_of_two(4);        
        check_if_pow_of_two(5);
    }
}
