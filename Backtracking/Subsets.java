package Backtracking;

public class Subsets {

    public static void findSubsets(String str, int i, StringBuilder result) {
        if (i == str.length()) {
            if (result.length() == 0) {
                System.out.print("null");
            } else {
                System.out.println(result);
            }
            if (result.length() >= 1) {
                result.deleteCharAt(result.length() - 1);
            }

            return;
        }

        findSubsets(str, i + 1, result.append(str.charAt(i)));
        //  result.deleteCharAt(result.length() - 1);------------------>yaha pe bhi likh skte hai
        findSubsets(str, i + 1, result);
    }

    public static void main(String args[]) {
        findSubsets("abc", 0, new StringBuilder(""));
    }
}
