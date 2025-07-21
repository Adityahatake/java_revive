public class sortedcheck {
    public static void main(String[] args) {
        int arr1[] = { 2, 4, 5, 6, 7 };
        int arr2[] = { 2, 6, 5, 8, 7 };
        // Check if arr1 is sorted and print the result
        System.out.println(isSorted(arr1, 0));
        System.out.println(isSorted(arr2, 0));

    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

}
/*
 * This program checks if an array is sorted in ascending order using recursion.
 * 
 * - The main method defines two arrays: arr1 (sorted) and arr2 (not sorted).
 * - It prints the result of checking if each array is sorted by calling
 * isSorted.
 * 
 * The isSorted method:
 * - Takes an integer array and a starting index.
 * - Base case: If the index is at the last element, the array is sorted, so
 * return true.
 * - If the current element is greater than the next, return false (not sorted).
 * - Otherwise, recursively check the rest of the array.
 */