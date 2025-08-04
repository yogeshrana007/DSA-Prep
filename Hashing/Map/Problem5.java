// count number number of SubArray sum equal to k

import java.util.HashMap;

public class Problem5 {

    public static void main(String args[]) {

        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>(); // sum,count

        int sum = 0;
        int ans = 0;

        //first we need to insert 0 so that if single subarray present whose sum equal to k then wee need to add 0 
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        System.out.println(ans);
    }
}
