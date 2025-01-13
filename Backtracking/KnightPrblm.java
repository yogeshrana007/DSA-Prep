package Backtracking;

public class KnightPrblm {

    public static void grid(int[][] board, int row, int col, int val) {
        if (row < 0 || col < 0 || row >= board.length || col >= board.length || board[row][col] != 0) {
            return;
        } else if (val == board.length * board.length) {
            board[row][col] = val;
            printSol(board);
            return;
        }

        board[row][col] = val;

        // up
        grid(board, row - 2, col - 1, val + 1);
        grid(board, row - 2, col + 1, val + 1);

        //down
        grid(board, row + 2, col - 1, val + 1);
        grid(board, row + 2, col + 1, val + 1);

        //left
        grid(board, row - 1, col - 2, val + 1);
        grid(board, row + 1, col - 2, val + 1);

        //right
        grid(board, row - 1, col + 2, val + 1);
        grid(board, row + 1, col + 2, val + 1);

        board[row][col] = 0;
    }

    public static void printSol(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.printf("%3d", board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int N = 6;
        int[][] board = new int[N][N];
        grid(board, 0, 0, 1);
        //printSol(board);
    }
}
