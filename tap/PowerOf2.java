package tap;

public class PowerOf2 {
    static boolean find(int num) {
        if (num==0) {
            return false;
        }
        return (num & (num-1)) == 0;

    }
    public static void main(String[] args) {
        System.out.println(find(0));
    }
}
