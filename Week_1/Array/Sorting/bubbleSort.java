public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort: ");
        int arr[] = { 2, 3, 5, 1, 4, 3, };
        bubble(arr);
        System.out.print("{");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("}");

    }

    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j =0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}