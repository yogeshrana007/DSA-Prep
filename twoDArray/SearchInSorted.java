package twoDArray;

public class SearchInSorted {

    // first one is brute force and time complwxity O(n^2)
    // Second one is using i) row wise sorted or ii) coloumn wise sorted
    static boolean UsingRC(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[0].length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (key == matrix[i][mid]) {
                    System.out.println("key available at : [" + i + "," + mid + "]");
                    return true;
                } else if (key < matrix[i][mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        System.out.println("Element not found !");
        return false;
    }

// Using StairCase 
    static boolean stairCase(int[][] matrix, int key) {
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("key available at : [" + row + "," + col + "]");
                return true;
            } else if (key < matrix[row][col]) {
                row--; 
            }else {
                col++;
            }
        }
        System.out.println("Key Not Found !");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};
        int key = 48;
        stairCase(matrix, key);
        //UsingRC(matrix, key);
    }
}
