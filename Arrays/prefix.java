package Arrays;

public class prefix {
    public static void maxArray(int array[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        for (int i = 0; i < prefix.length; i++) {
            prefix[i] = i == 0 ? array[i] : prefix[i - 1] + array[i];
        }
        int sum = 0;
        for (int i = 0; i < prefix.length; i++) {
            for (int j = 0; j < prefix.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            if (sum > max) {
                max = sum;
            }

        }
        System.out.println("Maximum sum of subarray is : " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 7, -2, 6, -1, 3 };
        maxArray(arr);

    }

}
