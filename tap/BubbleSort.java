package tap;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        int[] result = bubble(arr);

        for (int i : result) {
            System.out.println(i);
        }

    }

    private static int[] bubble(int[] arr) {

        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex >0 ; lastUnsortedIndex--) {

            for (int i =0; i<lastUnsortedIndex; i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
    }
}
