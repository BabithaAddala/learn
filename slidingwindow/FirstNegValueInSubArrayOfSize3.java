package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegValueInSubArrayOfSize3 {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 13, 28};
        int maxSubArraySize = 3;
        System.out.println(find(arr, maxSubArraySize));
    }

    private static List<Integer> find(int[] arr, int maxSubArraySize) {
        List<Integer> result = new ArrayList<>();

        for (int i=0;i<arr.length;i++) {
            for (int j = i; j < (i+maxSubArraySize) && j<arr.length; j++) {
                if (arr[j] < 0) {
                    result.add(arr[j]);
                    break;
                }
            }
        }
            return result;

    }
}
