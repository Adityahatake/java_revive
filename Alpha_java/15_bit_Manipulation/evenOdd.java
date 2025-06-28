public class evenOdd {
    public static void check_Even_Odd(int num) {
        int bitmask=1;
        if((num & bitmask)==1){
            System.out.println("Odd");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int number=5;
        check_Even_Odd(number);
    }
}
