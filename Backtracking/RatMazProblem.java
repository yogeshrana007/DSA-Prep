package Backtracking;

public class PracticeQ {

    // Q1
    public static void grid(int[][] mat, int i, int j, int n, int m,int[][]sol) {
        if(i<0||j<0||i==n||j==m||mat[i][j]==0||sol[i][j]==1){
            return;
        }
        sol[i][j]=1;

        if(i==n-1&&j==m-1){
            printSol(sol);
            sol[i][j]=0;
            return ;
        }

        // up
        grid(mat,i-1, j, n, m,sol);

        //down
        grid(mat,i+1, j, n, m,sol);

        // left
        grid(mat,i, j-1, n, m,sol);

        //right
        grid(mat,i, j+1, n, m,sol);

        sol[i][j]=0;
    }
    public static void printSol(int[][] sol){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void main(String args[]) {
        int n=4,m=4;
        int [][] sol=new int[m][n];
        int [][] mat={{1,1,1,1},
        {1,0,0,1},
        {1,0,0,1},
        {1,1,1,1}
    };
        grid(mat,0, 0, n,m,sol);
    }
}
