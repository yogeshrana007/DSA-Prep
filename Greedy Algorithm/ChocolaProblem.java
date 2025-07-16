package Greedy.Algorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {

    public static void main(String args[]) {
        int n = 4, m = 6;
        Integer[] verticalCuts = {2, 1, 3, 1, 4};
        Integer[] horizontalCuts = {4, 1, 2};

        Arrays.sort(verticalCuts, Collections.reverseOrder());
        Arrays.sort(horizontalCuts, Collections.reverseOrder());

        int hp = 1, vp = 1; // horizontal & vertical pieces
        int v = 0, h = 0;
        int totalVal = 0;

        while (v < verticalCuts.length && h < horizontalCuts.length) {
            if (horizontalCuts[h] >= verticalCuts[v]) {
                totalVal += vp * horizontalCuts[h];
                hp++;
                h++;
            } else {
                totalVal += hp * verticalCuts[v];
                vp++;
                v++;
            }
        }

        while (h < horizontalCuts.length) {
            totalVal += vp * horizontalCuts[h];
            hp++;
            h++;
        }

        while (v < verticalCuts.length) {
            totalVal += hp * verticalCuts[v];
            vp++;
            v++;
        }

        System.out.println("Minimum cost to break chocolate is : " + totalVal);
    }
}
