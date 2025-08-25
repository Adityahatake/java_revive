public class Quick_sort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
         //time complexity : O(n^2){worst}
        //space complexity : within 

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr , int si , int ei) {
        //base case (just the let the function know when to stop)
        if (si >= ei) {
            return;
        }
        //last element
        int pidx = partition(arr, si, ei); //pivot index
        quickSort(arr, si, pidx-1); //left
        quickSort(arr, pidx+1, ei); //right
    }
    public static int partition(int[] arr , int si , int ei) {
        int pivot =arr[ei];
        int i =si-1 ; //to make place for els smaller than pivot
        // Keeps track of "smaller than pivot" region

        for(int j=si; j<ei;j++){
            
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        // pivot ko sahi place pe lana
        i++;
        int temp = pivot;
                arr[ei]=arr[i]; //pivot =arr[i](wrong)
                arr[i]=temp;
                return i;
       
    }

}
