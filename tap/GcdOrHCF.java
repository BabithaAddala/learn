package tap;

public class GcdOrHCF {
    public static void main(String[] args) {
        int a = 20, b = 15;
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        for (int i = min; i>=1; i--) {
            if (a%i == 0 && b%i ==0){
                return i;
            }
        }

        return 1;
    }
}
