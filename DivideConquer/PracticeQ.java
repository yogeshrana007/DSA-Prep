package DivideConquer;

public class PracticeQ {


    // Q---1
    public static void sortStringUsingMergseSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        sortStringUsingMergseSort(arr, si, mid);
        sortStringUsingMergseSort(arr, mid + 1, ei);

        merging(arr, si, mid, ei);
    }

    public static void merging(String[] arr, int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        String[] temp = new String[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (i = si, k = 0; i < temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }


    // Q---3

    public static int inversionCount(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // String[] arr = {"sun", "earth", "mars", "mercury"};
        // sortStringUsingMergseSort(arr, 0, arr.length - 1);

        // for (Object elem : arr) {
        //     System.out.print(elem + " ");
        // }

        int[] arr={2,4,1,3,5};
        System.out.print(inversionCount(arr));
    }
}
