public class LT26 {
        public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[j] != nums[i]){
                nums[++j]=nums[i];
            }
        }
        return j+1;
        
    }
    public static void main(String[] args) {
        int  nums[]={1,2,1,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
