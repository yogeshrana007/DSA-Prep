package Patterns;

public class HollowRec {
   static void recPattern(int lastrow,int lastcol){
        for(int row=0;row<lastrow;row++){
            for(int col=0;col<lastcol;col++){
                if((row==0||row==lastrow)||(col==0||col==lastcol)){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        recPattern(3,4);
       
    }
    
}



/*for (int row = 0 ;row < 4; row++){
            for (int col=0;col<5;col++ ) {
                if((row==1||row==2)&&(col==1||col==2||col==3)){        // --------> this is true but not optimal
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
            */