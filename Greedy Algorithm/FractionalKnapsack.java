package Greedy.Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String args[]) {

        int[] weights = {10, 20, 30};
        int[] values = {20, 100, 120};
        int capacity = 40;

        double[][] ratio = new double[weights.length][2];

        for (int i = 0; i < weights.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) values[i] / weights[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double profit = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {  // reverse loop because ratio is sorted in ascending order

            int idx = (int) ratio[i][0];

            if (capacity >= weights[idx]) {

                profit += values[idx];
                capacity -= weights[idx];

            } else {
                profit += capacity * ratio[i][1];
                break;
            }
        }

        System.out.println("Maximum profit is:" + profit);
    }
}
