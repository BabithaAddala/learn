package tap;

public class MaxSubArray {
    public static int find(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (sum >= 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,-3,7,-13,8,-2,5,-6,7,-11,3,10,-10,-6,-10,7,2};
        //int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(find(arr));
    }
}
