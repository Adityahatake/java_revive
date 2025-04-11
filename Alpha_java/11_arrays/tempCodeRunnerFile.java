public class printSubarray {
    public static void print_Sub_Array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {

                    sum = sum + array[k];
                    System.out.print(array[k] + " ");
                }
                System.out.print("  sum:" + sum);
                System.out.println();

            }
            System.out.println("max sum: ");
            System.out.println();

        }
    }

    public static void main(String[] args) { // a continuos part of the array is called subarray
        int array1[] = { 1, 2, 3, 4, 5 };
        print_Sub_Array(array1);

    }

}
