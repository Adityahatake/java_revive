public class Merge_sort{
    public static void main(String[] args){
        int[] a1={6,3,9,5,2,8};
        System.out.println("unsorted array:");
        printArray(a1);
        

    }
    public static void mergeSort(int[] arr, int si , int ei) {
        //base case
        if(si>=ei){
            return;
        }
        // kaam 
        int mid= si+(ei-si)/2; //(si+ei)/2
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid, ei); //right part
        merge(arr, si, mid, ei);

    }
    public static void merge(int[] arr, int si ,int mid , int ei) {
        int temp[]=new int[ei-si+1];
        int i =si ;//iterator for left part
        int j= mid; //iterator for right part
        int k =0; // iterator for temp array 
        while (i<=mid && j<=ei) {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[i];
                j++;
                k++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
