public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 4, 3, };
        insertion(arr);
        
        for(int x: arr){
            System.out.print(x+" ");
        }
        
    }
    public static void insertion(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct pos to insert
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }

            
            //insertion
            arr[prev+1]=curr;
        }
    }  
}