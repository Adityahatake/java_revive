public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 4, 7,8,3 };
        selection(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }     
    }
    public static void selection(int[] arr) {
       for(int i=0;i<arr.length-1;i++){
        int minpos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
        }
        //swaps
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
       }
    }
}
