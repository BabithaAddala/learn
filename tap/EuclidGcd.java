package tap;

public class EuclidGcd {
    public static void main(String[] args) {
        int a = 20,b = 15;
        System.out.println(euclidGcd(a,b));
    }
    private static int euclidGcd(int a, int b) {
        // 1. Find the large number
        // 2. get the difference of the two numbers
        // 3. repeat untill the two numbers equal.
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a; // or return b; (since a=b)
    }
}
