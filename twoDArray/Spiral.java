package twoDArray;

public class Spiral {
    static void spiralMatrix(int matrix[][]){
        int sRow=0;
        int sCol=0;
        int eRow=matrix.length-1;
        int eCol=matrix[0].length-1;

        while(sRow <= eRow && sCol <= eCol ){

            for(int j = sCol; j <= eCol; j++){
                System.out.print(matrix[sRow][j]+" ");
            }

            for(int i=sRow+1; i <= eRow; i++){
                System.out.print(matrix[i][eCol]+" ");
            }

            if(sRow < eRow){
                for(int j = eCol-1; j >= sCol; j--){
                    System.out.print(matrix[eRow][j]+" ");
                }
            }

            if(sCol < eCol){
                for(int i=eRow-1; i > sRow; i--){
                    System.out.print(matrix[i][sCol]+" ");
                }
            }
            sRow++;
            sCol++;
            eRow--;
            eCol--;
        }
    }
    
    public static void main(String[] args){
        int [][] matrix={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12}
                        };

        spiralMatrix(matrix);
    }   
}
