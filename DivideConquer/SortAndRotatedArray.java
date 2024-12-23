package DivideConquer;

// class SortRotate{-----------------> agar class ka use krna ho to
//     int[] array;
//     SortRotate(int[] arr){
//             this.array=arr;
//     }
// }
public class SortAndRotatedArray {

    public static int findTarget(int[] arr, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target < arr[mid]) {
                return findTarget(arr, target, si, mid - 1);
            } else {
                return findTarget(arr, target, mid + 1, ei);
            }
        } else {
            if (arr[mid] < target && target < arr[ei]) {
                return findTarget(arr, target, mid + 1, ei);
            } else {
                return findTarget(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String agrs[]) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.print(findTarget(arr, 0, 0, arr.length - 1));

    }
}
