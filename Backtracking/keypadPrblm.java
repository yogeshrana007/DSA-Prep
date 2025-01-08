package Backtracking;

public class keypadPrblm {
    
    public static void numToString(char arr[][],String str,int i,StringBuilder sb){
        if(i==str.length()){
            System.out.print(sb.toString()+" ");
            return;
        }
        int digit=str.charAt(i)-'0';
        for(int j=0;j<arr[digit].length;j++){
            if(arr[digit][j]=='\0') break;
            sb.append(arr[digit][j]);
            numToString(arr, str, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
        
    public static void main(String args[]){
        char arr[][]={{},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}};

        // String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        numToString(arr, "23", 0, new StringBuilder(""));
    }
}
