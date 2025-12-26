package arrays;

public class SlidingWindow {
    public static int maxSum(int arr[], int k) {
        if (arr.length < k) return -1;
        int initialSum = 0;
        for (int i = 0; i < k; i++) {
            initialSum = initialSum + arr[i];
        }
        int maxSum = initialSum;
        for (int j = k; j < arr.length; j++) {
            initialSum = initialSum + arr[j] - arr[j - k];
            maxSum = Math.max(maxSum, initialSum);
        }
        return maxSum;
    }
}
