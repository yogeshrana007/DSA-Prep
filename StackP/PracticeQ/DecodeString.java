import java.util.Stack;
import java.util.Scanner;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char str = s.charAt(i);
            if(s.charAt(i) == ']'){
                StringBuilder sb = new StringBuilder("");
                while(!s2.isEmpty() && !s2.peek().equals("[")){
                    sb.insert(0, s2.pop());
                }
                s2.pop();
                int num = s1.pop();
                StringBuilder ans = new StringBuilder("");
                for(int j = 0; j < num; j++){
                    ans.append(sb);
                }
                s2.push(ans.toString());
            }
            else if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i)-'0');
                    i++;
                }
                s1.push(num);
                i--;
            } else{
                s2.push(s.charAt(i)+"");
            }
        }
        StringBuilder res = new StringBuilder("");
        while(!s2.isEmpty()){
            res.insert(0, s2.pop());
        }
        return res.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid string "); // (in the format of num[chars num [chars] ]) || nums outside and chars should be in []: 
        String s = sc.next();
        System.out.println(decodeString(s));
    }
}
