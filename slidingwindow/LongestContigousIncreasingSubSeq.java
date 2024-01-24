package slidingwindow;

public class LongestContigousIncreasingSubSeq {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,6,9,10};
        System.out.println(find(arr));
    }

    private static int find(int[] arr) {
        int j=0;
        int maxCount = 0;
        for (int i=1;i<arr.length;i++) {
            if(arr[i-1] > arr[i]) {
                j = i;
            }
            maxCount = Math.max(maxCount, i-j+1);
        }
        return maxCount;
    }
}
