public class binary_search {
    // prerequisite: sorted array
    public static int binarysearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                // right
                start = mid + 1;
            } else {// left
                end = mid - 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 11;
        int result = binarysearch(array, key);
        if (result == -1) {
            System.out.println("key is not present in the given array");
        } else {
            System.out.println("key is found at index : " + result);
        }

    }

}
