package Patterns;

public class FLOYD {
    static void floydPat(int lastrow){
        int count =1;
        for(int row=0;row<lastrow;row++){
            for(int col=0;col<=row;col++){
                System.out.printf("%3d",count );
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydPat(5);
        
    }
    
}
