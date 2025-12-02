public class LT66 {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry over
            }
            digits[i] = 0; // Set to 0 and continue
        }

        
        // If we're here, all digits were 9, so result is 100...0
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits; //here is 
        // the main case 

    }

    public static void main(String[] args) {
        
        int[] digits = {9,9};
        int[] result = plusOne(digits);
        System.out.print("Result: ");
        for (int digit : result) { 
            System.out.print(digit + " ");
            
        }
    }
}
