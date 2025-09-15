public class find_permutation {
    public static void main(String[] args) {
        System.out.println("test");
        String str="test";
    }
    public static void permutation(String str , String ans) {
        // base case

        // kaam (recursion)
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde" = "ab" +"de" ="abde"
            str=str.substring(0, i);str.substring(i+1);
            permutation(str, ans+curr);
        }


     
       
    }
}
