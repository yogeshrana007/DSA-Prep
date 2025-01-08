package Backtracking;

import java.util.Scanner;

public class NQueen {

    public static boolean isSafe(char[][] board,int row,int col){

        // Vertical up-----\
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // left up diagonal
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i-- , j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i = row-1, j = col+1; i >= 0 && j < board.length; i-- , j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                nQueens(board, row+1);
                board[row][col]='x';
            }
        }
    }

    public static void printBoard(char[][] board){
        for (int i = 0; i <board.length; i++) {
            for(int j = 0; j <board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("==========================");
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char board[][]=new char[n][n];

        // initialize array
        for (int i = 0; i <n; i++) {
            for(int j = 0; j <n; j++){
                board[i][j]='x';
            }
        }
        nQueens(board,0);
    }
}
