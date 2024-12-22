package Patterns;

public class Rhombus {
    static void solidRhom(int lastrow){
        for(int row=1;row<=lastrow;row++){
            for(int col=1;col<=lastrow-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=lastrow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solidRhom(5);
        
    }
    
}
