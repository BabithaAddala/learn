package tap;

// To find an element position where it can't be killed
public class JosephusAlgorithm {
    public static void main(String[] args) {
        int n = 7; // number of people/elements
        int k = 3; // killing factor -- every 3 rd person/element gets killed
        System.out.println(jos(n,k));
    }

    private static int jos(int n, int k) {
        if ( n==1) {
            return 0;
        }
        return (jos(n-1, k) + k) % n;
    }
}
