// LeetCode Problem 6: Zigzag Conversion
// Link: https://leetcode.com/problems/zigzag-conversion/

public class Solution2 {
    public String convert(String s, int numRows) {
        // If numRows is 1 or greater than or equal to string length, return original string
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create an array of StringBuilder, one for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Traverse the input string and append characters in zigzag pattern
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Change direction if we hit top or bottom
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move up or down depending on the current direction
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows to form the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "PAYPALISHIRING";
        int numRows = 3;
       
        // System.out.println(sol.convert(input, numRows)); // Output: "PAHNAPLSIIGYIR"

    }
}
