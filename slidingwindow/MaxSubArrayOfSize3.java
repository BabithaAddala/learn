package slidingwindow;

public class MaxSubArrayOfSize3 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int subArraySize = 3;
        System.out.println(find(arr, subArraySize));
    }

    private static int find(int[] arr, int subArraySize) {
        int sum = 0;
        int maxSum = 0;
        for (int i=0;i<subArraySize;i++) {
            sum += arr[i];
        }
        maxSum = sum;
        for (int i = subArraySize; i<arr.length; i++) {
            sum = (sum + arr[i]) - arr[i-subArraySize];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
