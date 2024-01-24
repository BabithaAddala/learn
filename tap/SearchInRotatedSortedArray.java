package tap;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {8,1,2,4,5,6,7};
        int target = 1;
        System.out.println(search(arr,target));
    }

    private static int search(int[] arr, int target) {

        int l = 0, r = arr.length-1;

        while(l<=r){
            int m = (l + r) / 2;
            if ( target == arr[m]) {
                return m;
            }
            else if (arr[l]<arr[m]) {
                if (target < arr[m] && target >= arr[l]) {
                    r = m - 1;
                    // l = l+1;
                } else {
                   l = m+1;
                }
            } else {
                if(target > arr[m] && target<=arr[r]) {
                    l = m+1;
                } else {
                    r = r-1;
                }
            }
        }

        return -1;
    }
}
