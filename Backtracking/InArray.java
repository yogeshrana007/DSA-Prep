package Backtracking;

public class InArray {

    public static void printArr(int[] arr) {
        for (Object elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void backtrackingInArray(int arr[], int idx, int value) {
        if (idx == arr.length) {
            printArr(arr);
            return;
        }
        arr[idx] = value;
        backtrackingInArray(arr, idx + 1, value + 1);
        arr[idx] = arr[idx] - 2;
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        backtrackingInArray(arr, 0, 1);
        printArr(arr);
    }
}
