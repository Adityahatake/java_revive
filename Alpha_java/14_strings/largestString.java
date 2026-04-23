public class largestString {
    // find the largest String in lexicographically
    public static void largest_String(String arr[]) {
        String largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            // largest.compareToIgnoreCase(arr[i]) , this function is used when we want
            // to ignore the lower and upper case of the String value when comparing
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        System.out.println("the largest String is: " + largest);

    }

    
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "papaya" };
        largest_String(fruits);
    }
}
