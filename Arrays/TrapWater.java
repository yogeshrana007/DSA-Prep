package Arrays;

public class TrapWater {
    public static void trappedLiq(int heigth[],int width){
        
         // left Max
        int leftMax[]=new int[heigth.length];
        leftMax[0]=heigth[0];
        
        for(int i=1;i<heigth.length;i++){
            leftMax[i]=Math.max(leftMax[i-1], heigth[i]);
        }

        // Right Max
        int rightMax[]=new int[heigth.length];
        rightMax[heigth.length-1]=heigth[heigth.length-1];
        for (int i =rightMax.length-2 ;i >=0; i--){
    
            rightMax[i]=Math.max(rightMax[i+1], heigth[i]);
        }
        
        for(int i:leftMax){
            System.out.print("|"+i+"| ");
        }
        System.out.println("Right :-");
        for(int i:rightMax){
            System.out.print("|"+i+"| ");
        }
        

            int trappedWater=0;
            for(int i=0;i<heigth.length;i++){
                int waterLevel=Math.min(leftMax[i], rightMax[i]);
                trappedWater+=(waterLevel-heigth[i])*width;
            }
            System.out.println("So total water stored is :"+trappedWater);
    }

    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        int width=1;
        trappedLiq(height,width);
    }
}
