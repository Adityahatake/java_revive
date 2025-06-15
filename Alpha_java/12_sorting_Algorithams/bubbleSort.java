public class bubbleSort {
    public static void bubble_Sort(int arr[]) {
        for (int turn = 0; turn < arr.length-1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        bubble_Sort(arr);
    } //complexity: n^2
}