
import java.util.HashMap;

public class MajorityElement {

    public static void main(String args[]) {
        // int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int[] nums = {1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.print(key + " ");
            }
        }
    }
}
