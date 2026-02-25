public class NQueens {
    private int n;
    private int[] board;
    private int solutionCount = 0;

    public NQueens(int n) {
        this.n = n;
        this.board = new int[n];
    }

    public void solve() {
        backtrack(0);
        System.out.println("Total solutions: " + solutionCount);
    }

    private void backtrack(int row) {
        if (row == n) {
            printSolution();
            solutionCount++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(row, col)) {
                board[row] = col;
                backtrack(row + 1);
            }
        }
    }

    private boolean isValid(int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check if queen exists in same column
            if (board[i] == col) {
                return false;
            }
            // Check diagonals
            if (Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private void printSolution() {
        System.out.println("Solution " + (solutionCount + 1) + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i] == j ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens(4);
        nQueens.solve();
    }
}