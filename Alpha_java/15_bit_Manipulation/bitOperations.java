public class bitOperations {
    public static void get_iTH_bit(int n ,int i) {
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println("bit is: "+0);
        }else{
            System.out.println("bit is: "+1);
        }

    }
    public static void set_iTH_bit(int n ,int i) {
        int bitmask =1<<i;
        System.out.println(n | bitmask);
    }


    public static void main(String[] args) {
        System.out.println("test   ");
        get_iTH_bit(10, 3);
        set_iTH_bit(10, 2);
    }
    
}
