public class linearSearch {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
    public static void printArray(String array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    } 
    public static int linear_Search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int linear_Search(String array[], String key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = { 12, 3, 35, 36, 17, 18, 4, 6, 43, 2, 21 };
        int key = 17;
        String item = "aloo_Paratha";
        String food_Items[] = { "Samose", "chole_Bhature", "chowmein", "dahi_Bhalle", "pizza", "aloo_Paratha" };

        printArray(numbers);
        System.out.println();
        printArray(food_Items);
        System.out.println();
        int result = linear_Search(numbers, key);
        if (result == -1) {
            System.out.println("The element is not found in the given array");
        } else {
            System.out.println("the element is found at the index: " + result);
        }
        System.out.println();
        int result2 = linear_Search(food_Items, item);
        if (result2 == -1) {
            System.out.println("The element is not found in the given array");
        } else {
            System.out.println("the element is found at the index: " + result2);
        }
    }
}
