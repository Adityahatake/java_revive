public class continue_statement {
    public static void main(String[] args) {
        // continue statement: it is used to skip the loop itration when the certain
        // condition is matched
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
