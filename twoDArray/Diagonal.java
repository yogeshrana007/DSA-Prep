package twoDArray;

public class Diagonal {
    static void sumOfDiagonal(int [][]matrix){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1)
                sum+=matrix[i][matrix.length-i-1];
        }
        System.out.println("Sum of primary and secondary diagonal is :"+sum);
        
    }
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4,17},
                         {5,6,7,8,18},
                         {9,10,11,12,19},
                         {13,14,15,16,20},
                         {21,22,23,24,25}};

        sumOfDiagonal(matrix);
    }
    
}
