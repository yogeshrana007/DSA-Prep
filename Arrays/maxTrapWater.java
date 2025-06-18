// Question asked which two container should we take so that it can trap maximum water
package Arrays;

public class maxTrapWater {
    public static int waterTrap(int[] height) {
        int n = height.length;
        
        int maxWater=0;
        int left=0;
        int right=n-1;

        while(left<right){
            int minHeight=Math.min(height[left],height[right]);
            maxWater=Math.max(maxWater, minHeight*(right-left));

            while(left<right&&height[left]<=minHeight){
                ++left;
            }
            while(left<right&&height[right]<=minHeight){
                --right;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        
        int[] arr = {4,2,0,6,3,2,5};
        System.out.print(waterTrap(arr));
    }
}
