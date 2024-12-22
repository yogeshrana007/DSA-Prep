package Arrays;

public class Assignment {

    // Question  1
    static boolean equalNum(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            }
        }
        return false;
    } 

    // Question 2

    static int findingElement(int num[],int target){
        int left=0;
        int right=num.length-1;

       while(left<=right){
        int mid=(left+right)/2;

        if(num[mid]==target){
            return mid;
        }

        if(num[left]<=num[mid]){
            if(target<num[mid]&&target>=num[left]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        else{
            if(target>num[mid] && target<=num[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
       }
       return -1;
    }


    // Q-4
static int TrapWater(int height[],int width){
    int n= height.length;

    // for left Max
    int leftMax[]=new int[height.length];
    leftMax[0]=height[0];
    for(int i=1;i<n;i++){
        leftMax[i]=Math.max(leftMax[i-1], height[i]);
    }

    // For right max
    int[] rightMax=new int[height.length];
    rightMax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightMax[i]=Math.max(rightMax[i+1], height[i]);
    }
    int watertrapped=0;
    for(int i=0;i<n;i++){
        int waterlevel=Math.min(leftMax[i], rightMax[i]);
        watertrapped+=(waterlevel-height[i])*width;
    }
    return watertrapped;
}


    public static void main(String[] args) {
        int num[]={4,5,6,0,1,2,3};
      
        // Q1
        //System.out.println(equalNum(num));

        // Q2
       // int target=3;
      //System.out.println(findingElement(num, target));

        //Q4
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int width=1;
        System.out.println("Trapped water is :"+TrapWater(height, width));
        
    }
    
}
