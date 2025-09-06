public class IntroductionToBacktracking {

    // Size of the chessboard
    static final int N = 4;

    // Function to print the chessboard
    public static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if placing a queen is safe
    public static boolean isSafe(int[][] board, int row, int col) {
        // Check this column on upper rows
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Recursive function to solve N-Queens using backtracking
    public static boolean solveNQueens(int[][] board, int row) {
        // Base case: all queens are placed
        if (row == N) {
            printBoard(board); // print one valid solution
            return true;
        }

        // Try placing queen in each column of the current row
        boolean result = false;
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // place queen

                // Recur to place the rest
                result = solveNQueens(board, row + 1) || result;

                // Backtrack: remove queen
                board[row][col] = 0;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        System.out.println("All solutions for " + N + "-Queens problem:");
        solveNQueens(board, 0);
    }
}
