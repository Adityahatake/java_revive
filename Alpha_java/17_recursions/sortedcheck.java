public class sortedcheck {
    public static void main(String[] args) {
        int arr1[]={2,4,5,6,7};
        int arr2[]={2,6,5,8,7};
        System.out.println(ifsorted(arr1, 0));
        System.out.println(ifsorted(arr2, 0));
        
    }
    public static boolean ifsorted(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return ifsorted(arr, i+1);
    }

}