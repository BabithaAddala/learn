package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FindSubArraysAddToGivenNum {
    public static void main(String[] args) {
        int[] arr = {-1, -4, 0, 5, 3, 2, 1};
        int targetSum = 5;
        System.out.println(find(arr, targetSum));
    }

    private static List find(int[] arr, int targetSum) {
        List<List<Integer>> finalList = new ArrayList<>();

        int sum = arr[0] + arr[1];
        if (sum == targetSum) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[0]);
            list.add(arr[1]);
            finalList.add(list);
        }

        for (int i = 2; i < arr.length; i++) {
            sum = (sum + arr[i]) - arr[i - 2];
            if (sum == targetSum) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i - 1]);
                list.add(arr[i]);
                finalList.add(list);
            }
        }
        return finalList;

    }
}
