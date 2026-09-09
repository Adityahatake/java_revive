public class last_occurance {

    public static void main(String[] args) {
        System.out.println("Finding the last occurance");
        int[] arr1 = { 5, 2, 8, 2, 9 };
        int key = 2;
        System.out.println(last(arr1, key, 0));
    }

    public static int last(int[] arr, int key, int i) {
        // base case
        if (i == arr.length) {
            return -1;
        }

        int isFound = last(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}