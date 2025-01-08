package ArrayList;

import java.util.ArrayList;

public class WaterTrapped {

    public static int maxWaterBlwTwoLines(ArrayList<Integer> height){

        int maxWater=0;
        int left=0;
        int right=height.size()-1;

        while(left<right){
                int width=right-left;
                int minHeight=Math.min(height.get(left),height.get(right));
                maxWater=Math.max(maxWater, minHeight*width);
            while((left<right)&&(height.get(left)<=minHeight)){
                left++;
            }
            while(left<right&&(height.get(right)<=minHeight)){
                right--;
            }
        }
        return maxWater;
    }
    public  static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(maxWaterBlwTwoLines(height));
    }
}
