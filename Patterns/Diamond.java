package Patterns;

public class Diamond {
    static void diamondPat(int lastrow){
        for(int row=1;row<=lastrow;row++){
            for(int col=1;col<=lastrow-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    for(int row=lastrow;row>=1;row--){
        for(int col=1;col<=lastrow-row;col++){
            System.out.print(" ");
        }
        for(int col=1;col<=2*row-1;col++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        diamondPat(4);
        int marks[]=new int[5];
        
    }
    
}
