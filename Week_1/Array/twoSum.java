public class twoSum {
    public static void main(String args[]){
        System.out.println("Test");
        int arr[]={1,7,11,15,2};
        int target=9;
       int ans[]=two_sum(arr, target);
       System.out.println(ans[0]+" "+ans[1]);

    }

    public static int[] two_sum(int nums[], int target){
         for(int i=0;i<nums.length;i++){s
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[] {i,j};
            }
        }
      }
      return new int[] {-1,-1};
      
}
    }
