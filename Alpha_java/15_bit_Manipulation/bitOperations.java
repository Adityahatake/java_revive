public class bitOperations {
    public static void get_iTH_bit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("bit is: " + 0);
        } else {
            System.out.println("bit is: " + 1);
        }

    }

    public static void set_iTH_bit(int n, int i) {
        int bitmask = 1 << i;
        System.out.println(n | bitmask);
    }

    public static void clear_iTH_bit(int n, int i) {
        int bitmask = ~(1 << i);
        System.out.println(n & bitmask);
    }

    public static void update_iTH_bit(int n, int i, int newBit) {
        if (newBit == 0) {
            clear_iTH_bit(n, i);
        }
        if (newBit == 1) {
            set_iTH_bit(n, i);
        }
    }

    public static void clear_last_iTH_bit(int n, int i) {
        int bitmask = ~(0) << i;
        System.out.println(n & bitmask);
    }

    public static void clear_Range_of_iTH_bit(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        System.out.println(n & bitmask);
    }

    public static void main(String[] args) {
        System.out.println("test");
        get_iTH_bit(10, 3);
        set_iTH_bit(10, 2);
        clear_iTH_bit(10, 1);
        update_iTH_bit(10, 2, 1);
        clear_last_iTH_bit(15, 2);
        clear_Range_of_iTH_bit(10, 2, 4);
    }

}
