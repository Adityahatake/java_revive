public class largest{
    public static void main(String[] args) {
        System.out.println("Test");
        int arr[]={1,2,43,4,3,23};
        System.out.println(largestElement(arr));
    }
   
    public static int largestElement(int[] nums) {
        int l = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > l) {
                l = nums[i];
            }
        }

        return l;
    }
}
