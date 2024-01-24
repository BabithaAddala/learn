package tap;

public class RemoveDupsInSortedArray {
    public static void main(String[] args) {
        int[] ar = {2,2,2,3,3,4,6,6};
        int rd = print(ar);
        for (int i = 0; i<rd;i++){
            System.out.print(ar[i] +" ");
        }
    }

    private static int print(int[] ar) {
        int rd = 0;
        for (int i=1;i<ar.length;i++) {
            if (ar[rd]!=ar[i]) {
                rd++;
                ar[rd] = ar[i];

            }
        }
        return rd+1;
    }
}
