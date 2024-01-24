package tap;

public class RotateArrayKtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =-3;
        k = k % arr.length;
        if ( k < 0){
            k = k + arr.length;
        }
        rotate(arr, 0, k-1);
        rotate(arr, k, arr.length-1);
        rotate(arr, 0, arr.length-1);

        for ( int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void rotate(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
