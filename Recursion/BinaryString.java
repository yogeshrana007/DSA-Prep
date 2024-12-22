package Recursion;

public class BinaryString {
    public static void printBinStr(int n,int prevNum,String str){

        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStr(n-1, 0, str+"0");
        if(prevNum==0){
            printBinStr(n-1, 1, str+"1");
        }
    }

    public static void main(String args[]){
        printBinStr(4, 0, "");
    }
}
