package Patterns;

public class InvHalfPyra {
    static void invertPyramid(int lastrow) {
        for (int row = 1; row <= lastrow; row++) {
            for (int i = 1; i <= lastrow; i++) {
                if (i <= lastrow - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertPyramid(50);
    }

}
