public class TernaryExample5 {
    public static int min(int x, int y) {
        return (x < y) ? x : y;
    }

    public static void main(String[] args) {
        System.out.println("Smaller number is: " + min(15, 20));
    }
}
