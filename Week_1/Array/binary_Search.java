public class binary_Search {
    public static void main(String[] args) {
        System.out.println("Binary Search:");
         int arr[] = { 1, 2, 3, 4, 5, 6 ,7,8,9};
         int t1=9;
         int t2=19;
        System.out.println( BS(arr, t1));
        System.out.println( BS(arr, t2));

    }
    public static int BS(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;       
       while (s<=e) {
        int m=s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }
        if (arr[m]>target) {
            e=m-1;
        }else{
            s=m+1;
        }         
       }
       return -1;       
    }
}
