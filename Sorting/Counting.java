package Sorting;

public class Counting {

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }

        for (int e : arr) {
            System.out.print(e + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 6, 3, 5, 9};
        countingSort(arr);
    }
}
