public class palindrome {
    public static boolean ispalindrome(int n) {
        int originalnum = n;
        int reversenum = 0;

        while (n != 0) {
            int lastdigit = n % 10; // getting the last digit
            reversenum = reversenum * 10 + lastdigit; // building the reverse for comparasion
            n = n / 10; // removing the last digit
        }
        if(reversenum==originalnum){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(ispalindrome(121));
        System.out.println(ispalindrome(12));

    }
}
