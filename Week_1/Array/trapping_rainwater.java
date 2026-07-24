
public class trapping_rainwater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
      int i=  rainwater(arr);
      System.out.println(i);
    }
    public static int rainwater(int[] height) {
        int n=height.length;
        //calculate the left max boundry of array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }
        //calculate the right max boundry of array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
        // waterlevel=min(leftmax bound , rightmax bound)
        int waterlevel=Math.min(rightmax[i], leftmax[i]);
        // trapped water=waterlevel-height 
        trappedwater+=waterlevel-height[i];
            
        }
        //loop
        return trappedwater;
        
    }
}
