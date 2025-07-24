public class p_factorial {
    public static int factorial(int n) {
        System.out.println("Calling factorial(" + n + ")");
        if (n == 0) {
            System.out.println("Returning 1 from factorial(" + n + ")");
            return 1;
        }
        int result = n * factorial(n - 1);
        System.out.println("Returning " + result + " from factorial(" + n + ")");
        return result;
    }

    public static void main(String[] args) {
        int res = factorial(4);
        System.out.println("Final Result: " + res);
    }
}
