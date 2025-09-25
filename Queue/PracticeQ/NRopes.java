package Queue.PracticeQ;
import java.util.*;

public class NRopes {

    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        
        int cost = 0;
        while(pq.size() > 1){
            int num1 = pq.poll();
            int num2 = pq.poll();
            
            cost += num1+num2;
            pq.add(num1+num2);
        }
        return cost;
    }
    public static void main(String args[]){
        int[]  arr = {4,3,2,6};

        System.out.println(minCost(arr));
    }
}
