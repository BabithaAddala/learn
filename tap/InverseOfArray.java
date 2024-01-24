package tap;

public class InverseOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, 0, 4};
        inverse(arr);
    }

    private static void inverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            newArr[v] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
