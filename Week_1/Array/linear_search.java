public class linear_search {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int t1 = 4;
        int t2 = 7;
        System.out.println(LSA(arr, t1));
        System.out.println(LSA(arr, t2));
        String[] arr2 = { "Apple", "Banana", "Mango" };

        System.out.println(LSS(arr2, "Mango")); // 1
        System.out.println(LSS(arr2, "Orange")); // -1
    }

    public static int LSA(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int LSS(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
