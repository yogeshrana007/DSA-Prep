package Patterns;

public class Butterfly {
    static void butterflyPat(int lastrow){
        for(int row=1;row<=lastrow;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int col=1;col<=2*(lastrow-row);col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
                
        }
        
        
        for(int row=lastrow;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int col=1;col<=2*(lastrow-row);col++){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
                
        }
        
    } 
    public static void main(String[] args) {
        butterflyPat(4);
        
    }
    
}




/*for(int row=1;row<=lastrow;row++){
    for(int col=1;col<=lastrow;col++){
        if(row<=lastrow/2){
            if((col>row) && (col<lastrow-row+1)){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
        if(row>lastrow/2){
            if((col<row) && (col>lastrow-row+1)){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
    }
    System.out.println();
}
} */


