package twoDArray;

public class Spiral {
    static void spiralMatrix(int matrix[][]){
        int sRow=0;
        int sCol=0;
        int eRow=matrix.length;
        int eCol=matrix[0].length;
        while(sRow<eRow && sCol<eCol ){

            for(int j=sCol;j<eCol;j++){
                System.out.print(matrix[sRow][j]+" ");
            }
            for(int i=sRow+1;i<eRow;i++){
                System.out.print(matrix[i][eCol-1]+" ");
            }
            for(int j=eCol-2;j>=sCol;j--){
                System.out.print(matrix[eRow-1][j]+" ");
            }
            for(int i=eRow-2;i>sRow;i--){
                System.out.print(matrix[i][sCol]+" ");
            }
            sRow++;
            sCol++;
            eRow--;
            eCol--;
        }
    }
    
    public static void main(String[] args){
        int [][] matrix={{1,2,3,4,17},
                         {5,6,7,8,18},
                         {9,10,11,12,19},
                         {13,14,15,16,20},
                         {21,22,23,24,25}};

        spiralMatrix(matrix);
    }   
}
