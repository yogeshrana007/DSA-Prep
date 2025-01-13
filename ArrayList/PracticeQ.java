package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeQ {

    // Question 1
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return true;
        }
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.size() - 1; i++) {

            // Increasing Monotonic
            if (nums.get(i) > nums.get(i + 1)) {
                increasing = false;
            }
            // Decreasing Monotonic
            if (nums.get(i) < nums.get(i + 1)) {
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }

    // Question 2
    public static void lonelyNum(ArrayList<Integer> nums) {

        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 1; i < nums.size() - 1; i++) {
        //     if ((nums.get(i - 1) != nums.get(i) - 1) && (nums.get(i) + 1 != nums.get(i + 1))) {
        //         list.add(nums.get(i));
        //     }
        // }
        // if (nums.get(nums.size() - 2) != nums.get(nums.size() - 1) - 1) {
        //     list.add(nums.get(nums.size() - 1));
        // }
        // if (nums.size() > 1) {
        //     if (nums.get(0) + 1 < nums.get(1)) {
        //         list.add(nums.get(0));
        //     }
        // } else if (nums.size() == 1) {
        //     list.add(nums.get(0));
        // }

        for(int i=0;i<nums.size();i++){
            if(i!=0&&(nums.get(i-1)==nums.get(i)||nums.get(i-1)+1==nums.get(i))){
                continue;
            }
            if(i!=nums.size()-1&&(nums.get(i+1)-1==nums.get(i)||nums.get(i+1)==nums.get(i))){
                continue;
            }
            list.add(nums.get(i));
        }
        System.out.println(list);
    }

    //Q3
    public static int maxCount(ArrayList<Integer> nums, int key) {

        int[] count = new int[1001]; // as constraint is given in qs

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                count[nums.get(i + 1)]++;
            }
        }
        int maxCount = 0;
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (maxCount < count[i]) {
                maxCount = count[i];
                max = i;
            }
        }
        return max;

        /*
         * Not optimized
         * ArrayList<Integer> list=new ArrayList<>();
         * for(int i=0;i<nums.size()-1;i++){
         * if(nums.get(i)==key){
         * list.add(nums.get(i+1));
         * }
         * }
         * int maxCount=0;
         * int maxAt=0;
         * for(int i=0;i<list.size();i++){
         * int count=0;
         * for(int j=i;j<list.size();j++){
         * if(list.get(i)==list.get(j)){
         * count++;
         * }
         * }
         * maxCount=Math.max(maxCount,count);
         * if(maxCount<count){
         * maxAt=i;
         * }
         * }
         * return list.get(maxAt);
         */
    }

    public static ArrayList beatifuList(int n){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);

        while(ans.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            for(Integer e : ans){
                if(2*e-1<=n){
                    temp.add(2*e-1);
                }
            }
            for(Integer e:ans){
                if(2*e<=n){
                    temp.add(2*e);
                }
            }
            ans=temp;
        }
        return ans;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();

        // Q1
        /*
         * nums.add(2);
         * nums.add(2);
         * nums.add(2);
         * nums.add(2);
         * System.out.println(isMonotonic(nums));
         */

        // Q2
        
            // nums.add(10);
            // nums.add(6);
            // nums.add(5);
            // nums.add(8);
            // lonelyNum(nums);
        

        // Q3
        /*
         * nums.add(1);
         * nums.add(100);
         * nums.add(200);
         * nums.add(1);
         * nums.add(100);
         * System.out.println(maxCount(nums, 1));
         */

        // Q4
        int n = 6;
        System.out.println(beatifuList(n));
    }
}
