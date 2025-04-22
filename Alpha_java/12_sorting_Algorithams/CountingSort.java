import java.util.Scanner;

public class CountingSort {

    // Counting Sort method
    public static void countingSort(int[] arr) {
        int max = findMax(arr);

        // Create count array
        int[] count = new int[max + 1];

        // Count each element
        for (int num : arr) {
            count[num]++;
        }

        // Overwrite original array with sorted values
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // Helper method to find max value in the array
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements (non-negative integers):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        countingSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
