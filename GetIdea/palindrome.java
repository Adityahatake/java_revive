public class palindrome {
    public static void main(String[] args) {
        System.out.println("Test");
        int arr[]={1,2,3,2,1};
        
        System.out.println(checkPalindrome(arr));
    }

    public static boolean checkPalindrome(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        if (arr[i] != arr[arr.length - 1 - i]) {
            return false;
        }
    }
    return true;
}
}
