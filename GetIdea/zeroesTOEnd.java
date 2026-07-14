public class zeroesTOEnd {
    public static void main(String[] args) {
        System.out.println("Test");
        int[] arr = { 1, 0, 5, 0, 3, 7, 0 };
        moveZeroB(arr);
        moveZeroF(arr);
       


       
    }

   public static void moveZeroB(int[] arr) {
    int index = 0;
    // Move all non-zero elements to the front
    //{ 1, 0, 5, 0, 3, 7, 0 };
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
    }

    for (int x : arr) {
        System.out.print(x + " ");
    }
    System.out.println();
}

public static void moveZeroF(int[] arr) {
    int index = 0;
    // Move all non-zero elements to the front
    //{ 1, 0, 5, 0, 3, 7, 0 };
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            index++;
        }
    }

    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
}
