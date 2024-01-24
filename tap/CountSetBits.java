package tap;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(find(42));
    }
    private static int find(int n) {
        int count = 0;

        while(n >0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
