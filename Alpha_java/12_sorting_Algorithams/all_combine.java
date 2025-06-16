public class all_combine {

    public static void insertion_Sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // inserting
            arr[prev + 1] = curr;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

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

    public static void bubble_Sort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 2 };
        bubble_Sort(arr);
        selection_sort(arr);
        insertion_Sort(arr);
    }
}
