
import java.util.HashMap;

public class Problem4 {

    public static void main(String args[]) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>(); // store sum & idx

        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                len = Math.max(len, i - map.get(sum));
            }
        }
        System.out.println("Largest subarray whose sum is 0 is of length : " + len);
    }
}
