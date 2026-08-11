public class setithbit {
    public static void main(String[] args) {
        setbitith(10, 2);
    }
    public static void setbitith(int n , int i) {
        int bitmask =1<<i;
        System.out.println(n|bitmask);
    }
}
