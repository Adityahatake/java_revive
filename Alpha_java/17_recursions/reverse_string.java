public class reverse_string {

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    public static void helper(char[] s, int start, int end) {
        if (start >= end) return;  //  base case

        //  recursive case: swap and move inwards
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        helper(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);  // Output: olleh
    }
}
