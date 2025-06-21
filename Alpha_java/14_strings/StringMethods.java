public class StringMethods {
    public static void main(String[] args) {
        String text = "Aditya Daksh";

        // 1. Length of string
        System.out.println("Length: " + text.length());

        // 2. Character at a specific index
        System.out.println("Char at index 2: " + text.charAt(2));

        // 3. Substring
        System.out.println("Substring (0 to 6): " + text.substring(0, 6));

        // 4. Convert to upper and lower case
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 5. Check if string contains another string
        System.out.println("Contains 'Daksh'? " + text.contains("Daksh"));

        // 6. Index of a character or string
        System.out.println("Index of 'D': " + text.indexOf('D'));
    }
}
