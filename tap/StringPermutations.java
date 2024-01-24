package tap;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        permutations(str.toCharArray(), 0);
    }

    private static void permutations(char[] c, int fi) {
        if (fi == c.length-1) {
            System.out.println(c);
            return;
        }
        for (int i = fi; i<c.length; i++) {
            swap(c, i, fi);
            permutations(c, fi+1);
            swap(c, i , fi);
        }

    }

    private static void swap(char[] c, int i, int fi) {
        char ch = c[i];
        c[i] = c[fi];
        c[fi] = ch;
    }
}
