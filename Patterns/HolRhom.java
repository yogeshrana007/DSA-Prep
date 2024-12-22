package Patterns;

public class HolRhom {
    static void hollowRhombus(int lastrow){
        for(int row=1;row<=lastrow;row++){
            // space
            for(int i=0;i<lastrow-row;i++){
                System.out.print(" ");
            }
            for(int col=1;col<=lastrow;col++){
                if(col==1||col==lastrow||row==1||row==lastrow){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowRhombus(7);
    }
    
}
