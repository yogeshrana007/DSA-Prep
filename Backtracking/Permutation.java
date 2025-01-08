package Backtracking;

public class Permutation {

    public static void findPermutation(String str, StringBuilder result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, result.append(curr));
            result.deleteCharAt(result.length() - 1);

        }
    }

    public static void main(String args[]) {
        findPermutation("abc", new StringBuilder(""));
    }
}
