public class getithbit {
    public static void main(String[] args) {
        getbitith(10, 3);
        getbitith(10, 2);
    }
    public static void getbitith(int n , int i) {
        int bitmask =1<<i;
        if((n&bitmask)==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}
