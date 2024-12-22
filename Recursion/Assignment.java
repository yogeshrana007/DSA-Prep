package Recursion;

public class Assignment {

    // Question 1
    public static void printOcc(int i, int key, int[] arr) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        printOcc(i + 1, key, arr);
    }

    // Question 2
    public static void numToString(int n, String[] numArr) {
        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        numToString(n / 10, numArr);
        System.out.print(numArr[lastDigit] + " ");
    }

    // Q3
    static int stringLength(String str) {
        //  System.out.print(numArr[i]+" ");
        if (str.length() == 0) {
            return 0;
        }
        return stringLength(str.substring(1)) + 1;
    }

    // Question 4
    static int count = 0;

    public static int countSubStr(String str, int start, int i) {
        if (start >= str.length()) {
            return 0;
        }
        if (i == str.length()) {
            return countSubStr(str, start + 1, start + 1);
        }
        int count = (str.charAt(i) == str.charAt(start) ? 1 : 0) + countSubStr(str, start, i + 1);
        return count;

    }

    public static void main(String[] args) {

        // Q_1
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // printOcc(0, 2, arr);

        // Q_2
        String numArr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        //numToString(1958 ,numArr);

        // Q3
        //System.out.println(stringLength("Yogesh Rana"));
        //
        // Q4
        //System.out.println(countSubStr("abcab", 0, 0));
        // Q5
    }
}
