public class bubble_opt {
    //optimized approach for the bubble sort 
        public static void bubble_Sort_opt(int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            boolean swap=false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                }
            }
             if(!swap){
                    break;
                }
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        bubble_Sort_opt(arr);
    }
}
