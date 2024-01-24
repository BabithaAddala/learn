package tap;

public class PyramidStar {
    public static void main(String[] args) {
        int i,j,k,n=8;
        for ( i=1;i<=8;i++) {
            for ( k = 1;k<=(n-i);k++){
                System.out.print(" ");
            }
            for (j =0;j<i;j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
