package Greedy.Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {

    static class Job {

        int deadline;
        int profit;
        char id;

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String args[]) {

        int[][] jobInfo = {{'A', 3, 50}, {'B', 1, 10}, {'C', 1, 40}, {'D', 1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job((char) jobInfo[i][0], jobInfo[i][1], jobInfo[i][2]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        // finding max deadline
        int maxDeadline = 0;
        for (int i = 0; i < jobInfo.length; i++) {
            maxDeadline = Math.max(maxDeadline, jobInfo[i][1]);
        }

        boolean[] slot = new boolean[maxDeadline + 1];

        char[] sequence = new char[maxDeadline + 1];

        int totalProfit = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            for (int j = curr.deadline; j >= 1; j--) {
                if (!slot[j]) {
                    sequence[j] = curr.id;
                    slot[j] = true;
                    totalProfit += curr.profit;
                    break;
                }
            }
        }

        System.out.print("Sequence of job to achieve maximum profit is : ");
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] != '\0') {
                System.out.print(sequence[i] + " ");
            }
        }
        System.out.println("\nmaxProfit : " + totalProfit);
    }
}
