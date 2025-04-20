public class bubble_Sort {
    public static void bubbleSort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) {

            for (int j = 0; j < array.length - 1; j++) {
                // compare
                if (array[j] > array[j + 1]) {

                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }

        }
        printArray(array);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int array[] = { 5, 4, 1, 2, 3 };
        System.out.println("array before sort: ");
        printArray(array);
        System.out.println();
        System.out.println("array after sort: ");
        bubbleSort(array);
        
    }
}
