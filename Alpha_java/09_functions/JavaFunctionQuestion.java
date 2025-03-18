public class JavaFunctionQuestion {
    public static void main(String[] args) {
        int result = mysteryFunction(5);
        System.out.println("Output: " + result); // What will be printed?
    }

    public static int mysteryFunction(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * mysteryFunction(n - 2);
    }
}
