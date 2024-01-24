package tap;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 6, 8, 10, 12, 14};
        reverseOfArray(arr);
    }

    private static void reverseOfArray(int[] arr) {
        int i=0;
        int j = arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k=0; k< arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
