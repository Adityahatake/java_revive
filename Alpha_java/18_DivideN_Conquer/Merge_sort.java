public class Merge_sort {
    public static void main(String[] args) {
        int[] a1 = { 6, 3, 9, 5, 2, 8 };
        System.out.println("unsorted array:");
        printArray(a1);
        System.out.println("sorted array: ");
        mergeSort(a1, 0, a1.length - 1);
        printArray(a1);

    }

    public static void mergeSort(int[] arr, int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei);

    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // if left part is left
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        // if right part is left

        while (j <= ei) {
            temp[k++] = arr[j++];

        }

        // copy temp to og array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
