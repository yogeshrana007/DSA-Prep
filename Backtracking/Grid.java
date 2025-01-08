package Backtracking;

public class Grid {

    //--------------------------Not with Best Approach (Exponential Time Complexity)----------------------------->
    public static int gridWaysWithExpoTC(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 || j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = gridWaysWithExpoTC(i + 1, j, n, m);
        int w2 = gridWaysWithExpoTC(i, j + 1, n, m);
        return w1 + w2;
    }

    //--------------------With linear (n+m) TC
    public static int gridWaysUsingPermu(int n, int m) {
        return (fac(n + m - 2) / (fac(n - 1) * fac(m - 1)));
    }

    public static int fac(int x) {
        if (x == 1) {
            return 1;
        }
        return x * fac(x - 1);
    }

    public static void main(String args[]) {

        //System.out.println(gridWaysWithExpoTC(0, 0, 4, 3));
        System.out.println(gridWaysUsingPermu(4, 9));
    }
}
