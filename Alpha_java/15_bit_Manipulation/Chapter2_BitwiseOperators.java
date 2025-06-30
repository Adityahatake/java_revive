public class Chapter2_BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 00511 in binary

        // AND
        int andResult = a & b;
        System.out.println("AND (a & b): " + andResult); // 0001 => 1

        // OR
        int orResult = a | b;
        System.out.println("OR (a | b): " + orResult);   // 0111 => 7

        // XOR
        int xorResult = a ^ b;
        System.out.println("XOR (a ^ b): " + xorResult); // 0110 => 6

        // NOT
        int notA = ~a;
        System.out.println("NOT (~a): " + notA);         // Inverts all bits

        // Left Shift
        int leftShift = a << 1;
        System.out.println("Left Shift (a << 1): " + leftShift); // 1010 => 10

        // Right Shift (with sign)
        int rightShift = a >> 1;
        System.out.println("Right Shift (a >> 1): " + rightShift); // 0010 => 2

        // Unsigned Right Shift
        int unsignedRightShift = a >>> 1;
        System.out.println("Unsigned Right Shift (a >>> 1): " + unsignedRightShift);

        // Negative number shifts
        int neg = -8;
        System.out.println("\nNegative number: " + neg);
        System.out.println("Binary: " + Integer.toBinaryString(neg));
        System.out.println("Signed Right Shift (-8 >> 1): " + (neg >> 1));
        System.out.println("Unsigned Right Shift (-8 >>> 1): " + (neg >>> 1));
    }
}
