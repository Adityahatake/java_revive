public class linear_search {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int arr[]={1,2,3,4,5,6};
        int t1=4;
        int t2=7;
        System.out.println(LS(arr, t1));
        System.out.println(LS(arr, t2));
    }

    public static int LS(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
