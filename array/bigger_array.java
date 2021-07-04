import java.util.*;

class bigger_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int[] br = new int[n];
        for (i = 0; i < n; i++)
            br[i] = scan.nextInt();
        int[] result = biggerTwo(ar, br);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int suma = a[0] + a[1];
        int sumb = b[0] + b[1];
        if (suma >= sumb)
            return a;
        else
            return b;
    }

}