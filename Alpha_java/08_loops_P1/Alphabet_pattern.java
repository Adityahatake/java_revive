public class Alphabet_pattern {
    // print the following pattern ......
    // A
    // BC
    // DEF
    // GHIJ
    // KLMNO
    public static void main(String[] args) {
        int n = 5;
        char value = 'A';
        for (int line = 1; line <= n; line++) {
            for (int alphabet = 1; alphabet <= line; alphabet++) {
                // System.out.print(value++); "also valid "
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
