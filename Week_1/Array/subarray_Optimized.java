public class subarray_Optimized {
    public static void main(String[] args) {
        System.out.println("Optimized way of sum of subarrays in java");
        System.out.println("Using the Prefix array");
        int[] arr={2,4,6,8,10};
        maxSubarraySum(arr);
    }
    //kaadanes Algoritham
    public static void maxSubarraySum(int[] arr) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        // calculate the prefix array
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=arr[i]+prefix[i-1];  
        }

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                currsum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("The Max sum ="+maxsum);
    }
}
