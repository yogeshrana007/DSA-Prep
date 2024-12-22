package Arrays;

public class Kadane {
    static void maxSumUsingKadane(int arr[]) {
        int cursum = 0;
        int maxSum = Integer.MIN_VALUE;
        // If all elements are zero means maxSum is 0
        for (int i = 0; i < arr.length; i++) {
            if (maxSum < arr[i]) {
                maxSum = arr[i];
                if (arr[i] > 0) {
                    break;
                }
            }
        }
        if (maxSum > 0) {
            for (int i = 0; i < arr.length; i++) {
                cursum = cursum + arr[i];
                if (cursum < 0) {
                    cursum = 0;
                }
                maxSum = Math.max(cursum, maxSum);
            }
            System.out.println("Maximum sum is :" + maxSum);
        } else {
            System.out.println("Maximum sum is :" + maxSum);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, -1, -2, -5, -3 };
        maxSumUsingKadane(arr);
    }

}
