package tap;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {2, 6, 12, 24, 25, 26, 28, 29 , 30};
        System.out.println(search(ar, 25));
    }

    private static int search(int[] ar, int key) {
        int l=0;
        int r = ar.length-1;
        while(l <= r) {
            int mid = (l+r)/2;
            if(key == ar[mid]) {
                return mid;
            } else if(key < ar[mid]) {
                r = mid -1 ;

            } else {
                l = mid +1;
            }
        }
        return -1;
    }
}
