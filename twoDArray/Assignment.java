package twoDArray;

public class Assignment {

    // Question 1
    static void sevenInMatrix(int[][] matrix1) {
        int count = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Number of seven in matrix is :" + count);
    }

    // Question 2
    // Question 3
    static void transposeOfMatrix(String[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        String[][] transpose = new String[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{4, 7, 8},
        {8, 8, 7}};
        sevenInMatrix(matrix1);

        int[][] nums = {{1, 4, 9},
        {11, 4, 3},
        {2, 2, 3}};

        String[][] matrix = {{"a1", "a2", "a3"},
        {"a2", "a3", "a3"}};
        transposeOfMatrix(matrix);
    }
}
