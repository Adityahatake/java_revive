public class square_pattern {
    public static void main(String[] args) {
        System.out.println("square pattern(using for loop): ");
        // using for loop
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * *");

        }
        // using while loop
        System.out.println("square pattern(using while loop): ");
        int line = 0;
        while (line < 4) {
            System.out.println("* * * *");
            line++;
        }
    }
}
