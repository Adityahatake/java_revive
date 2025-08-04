public class Rotated_array_search {
    public static void main(String[] args) {
       System.out.println("test");
      int[] a1={4,5,6,0,1,2}; //rotated array (given )
      int tar=6;
       printArray(a1);
      int a= searchRotatedArray(a1, tar);
      System.out.println("Found at index");
      System.out.println(a);
    }
    public static void printArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
    
}
// Function to search for a target in a rotated sorted array
public static int searchRotatedArray(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // Check if left half is sorted
        if (arr[left] <= arr[mid]) {
            if (target >= arr[left] && target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } else { // Right half is sorted
            if (target > arr[mid] && target <= arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
    return -1; // Not found
}
}
