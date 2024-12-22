package Patterns;

public class NumPyra {
    static void invertPyramid(int lastrow) {
        for (int row = 1; row < lastrow; row++) {
            for (int col = 1; col <= lastrow-row; col++) {
                    System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertPyramid(6);
    }

}