public class even_odd {
    public static void main(String[] args) {
        evenodd(33);
    }
    public static void evenodd(int n) {
        int bitmask =1;
        if((n&bitmask)==1){
            System.out.println("Odd");
        } if((n&bitmask)==0){
            System.out.println("even");
        }
        
    }
}
