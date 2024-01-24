package tap;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,6,6};

        int res =removeDups(arr);
        for (int i=0; i<res;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDups(int[] arr) {
        int rd = 0;

        for (int i = 1; i< arr.length;i++) {
            if (arr[rd] != arr[i]) {
                rd++;
                System.out.println(rd);
                arr[rd] = arr[i];

            }
        }
        return rd+1;
    }
}
