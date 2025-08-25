public class RAS {
    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if (si > ei) {
            return -1; // mial hi nhi
        }
        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2

        // case found
        if (arr[mid] == tar) {
            return mid;
        }
        // mid lies on l1
        if (arr[si] <= arr[mid]) {
            // case 1: left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case 2: right
            else {
                return search(arr, tar, mid + 1, ei);
            }
        } else { // mid lies on l2
            // case 3: right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }

    }

    public static void main(String[] args) {
        int arr1[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output--> 4
        int taridx = search(arr1, target, 0, arr1.length - 1);
        System.out.println(taridx);

    }
}
