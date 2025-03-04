public class break_statement {
    public static void main(String[] args) {
        // break statement is used to get out of the loop when the break condition matches
     
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 7) {
                break;
            }
        }
        System.out.println("I am out of the loop using break statement");
    }

}
