package tap;

public class CountSmallAndEqualElements {
    public static void main(String[] args) {
        int[] ar = {2, 6, 12, 24, 25, 25, 25, 29 , 30};
        System.out.println(search(ar, 20));
    }

    private static int search(int[] ar, int key) {
        int l=0;
        int r = ar.length-1;
        int mid = 0;
        while(l <= r) {
             mid = (l+r)/2;
            if(key == ar[mid]) {
                while(mid < ar.length-1 && ar[mid +1] == key) {
                    mid++;
                }
            } else if(key < ar[mid]) {
                r = mid -1 ;

            } else {
                l = mid +1;
            }
        }
        if (key < ar[mid]) {
            return mid;
        } else {
            return mid +1;
        }
    }
}
