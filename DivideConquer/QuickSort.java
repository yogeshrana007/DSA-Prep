package DivideConquer;

public class QuickSort {

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = ei;
        int j = si;
        int i = si - 1;
        while (j < ei) {
            if (arr[j] <= arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        i++;
        int temp = arr[pivot];
        arr[pivot] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String args[]) {
        int arr[] = {8, 2, 4, 1, 7};
        quickSort(arr, 0, arr.length - 1);

        for (Object e : arr) {
            System.out.print(e + " ");
        }
    }
}
