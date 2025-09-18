// most optimized approach (two pointer)

public class TrapRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(left < right){

            if(height[left] < height[right]){
                if(leftMax <= height[left]){
                    leftMax = height[left];
                }
                else{
                    water += leftMax - height[left];
                }
                left++;
            } 
            else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                } 
                else{
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args){
        int[] height ={7,0,4,2,5,0,6,4,0,5};
        System.out.println(trap(height)); 
    }
}