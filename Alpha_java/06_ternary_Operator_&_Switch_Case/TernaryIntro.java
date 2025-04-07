public class TernaryIntro {
    public static void main(String[] args) {
                // Ternary Operator Syntax:
        // condition ? value_if_true : value_if_false;

        int number = 10;

        // Using ternary operator to check if number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result);
    }
   
}
