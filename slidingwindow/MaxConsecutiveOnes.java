package slidingwindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1,1,1,0};
        System.out.println(find(arr));
    }

    private static int find(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
