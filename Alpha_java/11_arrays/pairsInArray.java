public class pairsInArray {
    public static void allPairsInArray(int array[]) {
        int total_pairs = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ") ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs are: " + total_pairs);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10, 12 };
        int array2[] = { 1, 2, 3, 4, 5, 6 };
        allPairsInArray(array);
        allPairsInArray(array2);
    }
}
