package tap;

public class SlidingWindow3 {
    public static int find(int[] arr, int windowSize) {
        int sum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<windowSize;i++) {
            sum += arr[i];

        }
       maxSum = Math.max(maxSum, sum);
        for (int i = windowSize; i<arr.length;i++) {
            sum = sum-arr[i-windowSize]+arr[i];
            maxSum = Math.max(maxSum, sum);
        }
       return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,9,31,-4,21,7};
        System.out.println(find(arr, 3));
    }
}
