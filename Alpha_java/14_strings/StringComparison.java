public class StringComparison {
    public static void main(String[] args) {
        String a = "Aditya";
        String b = "Aditya";
        String c = new String("Aditya");

        // 1. Using '=='
        System.out.println("a == b: " + (a == b));       // true (same reference in string pool)
        System.out.println("a == c: " + (a == c));       // false (new object)

        // 2. Using '.equals()'
        System.out.println("a.equals(b): " + a.equals(b)); // true (same content)
        System.out.println("a.equals(c): " + a.equals(c)); // true (same content)

        // 3. Using '.compareTo()'
        System.out.println("a.compareTo(b): " + a.compareTo(b)); // 0
        System.out.println("a.compareTo(\"Daksh\"): " + a.compareTo("Daksh")); // positive value
    }
}
