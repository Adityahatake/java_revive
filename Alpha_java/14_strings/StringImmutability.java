public class StringImmutability {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original: " + original);  // Still "Hello"
        System.out.println("Modified: " + modified);  // New string "Hello World"
    }
}
