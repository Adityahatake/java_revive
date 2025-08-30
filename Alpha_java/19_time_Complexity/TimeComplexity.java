/*
==================================================
 TIME COMPLEXITY NOTES (Java Examples)
 Author: Aditya Daksh
==================================================

📌 What is Time Complexity?
- Time complexity measures how the runtime of an algorithm grows
  with input size (n).
- We use Big-O notation to express the worst-case growth.

📌 Common Complexities (Fastest → Slowest):
O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(2^n) < O(n!)

==================================================
*/

public class TimeComplexity {

    // ===============================
    // O(1) – Constant Time
    // ===============================
    static int getFirstElement(int[] arr) {
        // Always executes in constant time
        return arr[0];
    }

    // ===============================
    // O(log n) – Logarithmic Time
    // Example: Binary Search
    // ===============================
    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // ===============================
    // O(n) – Linear Time
    // Example: Linear Search
    // ===============================
    static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    // ===============================
    // O(n log n) – Linearithmic Time
    // Example: Merge Sort
    // ===============================
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // ===============================
    // O(n^2) – Quadratic Time
    // Example: Bubble Sort
    // ===============================
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // ===============================
    // O(2^n) – Exponential Time
    // Example: Recursive Fibonacci
    // ===============================
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // ===============================
    // Main Function (Demo)
    // ===============================
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("O(1): First Element = " + getFirstElement(arr));
        System.out.println("O(log n): Binary Search for 4 = " + binarySearch(arr, 4));
        System.out.println("O(n): Linear Search for 5 = " + linearSearch(arr, 5));

        int[] arrForSort = {5, 4, 3, 2, 1};
        bubbleSort(arrForSort);
        System.out.print("O(n^2): Bubble Sorted Array = ");
        for (int num : arrForSort) System.out.print(num + " ");
        System.out.println();

        System.out.println("O(2^n): Fibonacci(5) = " + fibonacci(5));
    }
}

/*
==================================================
 📌 QUICK COMPARISON TABLE

 Complexity | Example Algorithm   | Notes
------------|---------------------|-------------------
 O(1)       | Access array index  | Fastest
 O(log n)   | Binary Search       | Efficient search
 O(n)       | Linear Search       | Scales linearly
 O(n log n) | Merge Sort, QuickSort| Best sorting (avg)
 O(n^2)     | Bubble Sort         | Slow for large n
 O(2^n)     | Recursive Fibonacci | Impractical

==================================================
*/
