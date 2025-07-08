package StackP;

import java.util.Scanner;
import java.util.Stack;

public class ValidString {

    public static boolean validParanthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else if ((ch == ')' || ch == '}' || ch == ']')) {
                if (s.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{') || (ch == ']' && s.peek() == '[')) {
                    s.pop();
                }
            }

        }
        return s.isEmpty();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string");
            String str = sc.next();
            if ("exit".equals(str)) {
                break;
            }

            if (validParanthesis(str)) {
                System.out.println("valid");
            } else {
                System.out.println("Invalid");
            }
        }

    }
}
