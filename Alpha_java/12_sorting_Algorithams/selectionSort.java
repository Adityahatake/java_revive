public class selectionSort {
    public static void selection_sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minpos = turn;
            for (int j = turn + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[turn];
            arr[turn] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        selection_sort(arr);
        // complexity n^2;


    }
}