public class two_sum_LT1 {
    
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i ,j};
                }
            }
        }
       return null;
    }

    public static void main(String[] args) {
        
        int nums[]={2,4,5,6};
        int target=6;
        int arr[]=twoSum(nums, target);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
