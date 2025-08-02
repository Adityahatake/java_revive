//example input : 
// int[][] matrix = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };
//expected output :
// Sum of row 0: 6
// Sum of row 1: 15
// Sum of row 2: 24

public class problem1 {

    public static void main(String[] args) {
        // Declare and initialize a 2D array (3 rows x 3 columns)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through each row
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0; // Initialize sum for this row

            // Loop through each column in the current row
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col]; // Add the element to the sum
            }

            // Print the sum of the current row
            System.out.println("Sum of row " + row + ": " + sum);
        }
    }
}



