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
        
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.print(waterTrap(arr));
    }
}
