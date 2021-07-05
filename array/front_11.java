import java.util.*;

class front_11 {
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
        int[] result = front11(ar, br);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] front11(int[] a, int[] b) {
        int n = 0;
        if (a.length > 0)
            n++;
        if (b.length > 0)
            n++;
        int[] res = new int[n];
        if (a.length > 0) {
            res[0] = a[0];
            if (n > 1)
                res[1] = b[0];
        } else {
            if (n == 1)
                res[0] = b[0];
        }
        return res;
    }

}