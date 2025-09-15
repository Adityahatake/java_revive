public class find_permutation {
    public static void main(String[] args) {
        // System.out.println("test");
        String str = "test";
        permutation(str, " ");
    }

    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // kaam (recursion)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" = "ab" +"de" ="abde"
            String Newstr = str.substring(0, i);
            str.substring(i + 1);
            permutation(Newstr, ans + curr);
        }

    }
}
