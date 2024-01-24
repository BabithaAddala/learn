package slidingwindow;

public class FindMaxLenOf1sFlip0s {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,0,0,0,1,1,1,0,1,1,1,1,1,1};
        int k = 2;
        System.out.println(find(arr, k));
    }

    private static int find(int[] arr, int k) {
       int j=0;
       int maxCount =0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == 0) {
                k--;
            }
            if (k < 0) {

                if (arr[j] == 0) {
                    k++;
                }
                j++;
            }
            maxCount = Math.max(maxCount, i-j);
        }
        return maxCount+1;
    }
}
