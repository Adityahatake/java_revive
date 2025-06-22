public class StringTypesSummary {
    public static void main(String[] args) {
        // String (immutable)
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s); // Still "Hello"

        // StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb); // "Hello World"

        // StringBuffer (mutable)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf); // "Hello World"
    }
}
