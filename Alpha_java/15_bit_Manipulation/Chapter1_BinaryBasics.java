public class Chapter1_BinaryBasics {
    public static void main(String[] args) {
        // Decimal to Binary Representation
        int number = 23;
        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + Integer.toBinaryString(number));

        // Negative Number Representation
        int negative = -23;
        System.out.println("\nNegative Decimal: " + negative);
        System.out.println("Binary (Two's Complement): " + Integer.toBinaryString(negative));

        // Two's Complement Explanation
        System.out.println("\n--- Two's Complement Concept ---");
        System.out.println("Binary of +23:  " + String.format("%32s", Integer.toBinaryString(number)).replace(' ', '0'));
        System.out.println("Binary of -23: " + String.format("%32s", Integer.toBinaryString(negative)).replace(' ', '0'));

        // Bit Length and Integer Range
        System.out.println("\n--- Integer Limits ---");
        System.out.println("Max Integer: " + Integer.MAX_VALUE + " (Binary: " + Integer.toBinaryString(Integer.MAX_VALUE) + ")");
        System.out.println("Min Integer: " + Integer.MIN_VALUE + " (Binary: " + Integer.toBinaryString(Integer.MIN_VALUE) + ")");
    }
}
