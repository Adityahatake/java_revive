public class bubble_optimized {
    public static void main(String[] args) {
        System.out.println("Bubble Sort: ");
        int arr[] = { 2, 3, 5, 1, 4, 3, };
        bubbleopt(arr);
        System.out.print("{");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("}");

    }
    public static void bubbleopt(int[] arr) {
                    int swaps=0;

                for (int i = 0; i < arr.length-1; i++) {
            for (int j =0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                 
                }             
            }
                if(swaps==0){
                    break;
                }
        }
    }
}
