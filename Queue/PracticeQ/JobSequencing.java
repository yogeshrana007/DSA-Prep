import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencing{

    static class Job{
        char id;
        int deadline;
        int profit;

        public Job(char id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args){

        ArrayList<Job> jobs = new ArrayList<>();

        int[][] jobInfo = {{'A', 4, 50}, {'B', 1, 30}, {'C', 1, 20}};

        for(int i = 0; i < jobInfo.length; i++){
            jobs.add(new Job((char)jobInfo[i][0], jobInfo[i][1], jobInfo[i][2]));
        }

        Collections.sort(jobs, (a,b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for(int i = 0; i < jobs.size(); i++){
            maxDeadline = Math.max(jobs.get(i).deadline, maxDeadline);
        }
        
        char[] slots = new char[maxDeadline+1];
        Arrays.fill(slots, '-');

        int maxProfit = 0;

        for(int i = 0; i < jobs.size(); i++){
            int deadline = jobs.get(i).deadline;
            if(slots[deadline] == '-'){
                slots[deadline] = jobs.get(i).id;
                maxProfit += jobs.get(i).profit;

            } else{
                for(int j = deadline - 1; j > 0; j--){
                    if(slots[j] == '-'){
                      slots[j] = jobs.get(i).id;
                      maxProfit += jobs.get(i).profit;
                      break;
                    } 
                }
            }
        }
        System.out.println("max Profit is : "+ maxProfit);
        for(int i = 0; i < slots.length; i++){
            if(slots[i] != '-'){
                System.out.print(slots[i]+" ");
            }
        }
    }
}