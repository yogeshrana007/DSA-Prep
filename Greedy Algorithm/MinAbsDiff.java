package Greedy.Algorithm;

import java.util.Arrays;

public class MinAbsDiff {

    public static void main(String args[]) {

        int[] A = {1, 2, 3};
        int[] B = {4, 1, 2};

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbs = 0;
        for (int i = 0; i < A.length; i++) {
            minAbs += Math.abs(A[i] - B[i]);
        }

        System.out.println(minAbs);
    }
}
