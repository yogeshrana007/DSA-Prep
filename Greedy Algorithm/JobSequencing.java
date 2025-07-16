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

        int[][] jobInfo = {{'A', 4, 20}, {'B', 2, 10}, {'C', 1, 40}, {'D', 3, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job((char) jobInfo[i][0], jobInfo[i][1], jobInfo[i][2]));
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Character> sequence = new ArrayList<>();
        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (time < curr.deadline) { // job has to finish before the time that's y we aren't including deadline time
                time++;
                sequence.add(curr.id);
            }
        }

        System.out.print("Sequence of job to achieve maximum profit is : ");
        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i) + " ");
        }
    }
}
