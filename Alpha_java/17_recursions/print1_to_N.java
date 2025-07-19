public class print1_to_N {
    public static void main(String[] args) {
        printOnetoN(5);
    }
    public static void printOnetoN(int n) {
        if (n == 1){
            System.out.print(" " + 1);
        } else {
            printOnetoN(n - 1);
            System.out.print(" " + n);
        }
    }
}
