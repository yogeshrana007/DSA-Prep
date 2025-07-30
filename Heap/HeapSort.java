package Heap;

public class HeapSort {

    // logic is based on ascending order
    public static void heapSort(int[] arr) {

        // Building maxHeap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {

            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i); // here i is the size which shows at which index we look for
        }
    }

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, size);
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        int[] arr = {2, 1, 5, 4, 3, 9, 6};

        printArr(arr);
        heapSort(arr);
        printArr(arr);
    }
}
