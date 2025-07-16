package Greedy.Algorithm;

import java.util.ArrayList;

public class CoinChangeProblem {

    public static void main(String args[]) {
        int[] denominations = {1, 2, 5, 10, 20, 50, 100, 500, 2000}; // first sort if not sorted

        int value = 5123;
        ArrayList<Integer> coins = new ArrayList<>();

        // I am using descending order because it's alreay given
        for (int i = denominations.length - 1; i >= 0; i--) {

            while (value >= denominations[i]) {
                coins.add(denominations[i]);
                value -= denominations[i];
            }
            if (value <= 0) {
                break;
            }
        }

        System.out.println("Total minimum denominations required : " + coins.size());

        for (int i = 0; i < coins.size(); i++) {
            System.out.print(coins.get(i) + " ");
        }

    }
}
