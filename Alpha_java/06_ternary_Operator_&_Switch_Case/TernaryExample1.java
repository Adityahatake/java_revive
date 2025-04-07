public class TernaryExample1 {
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
