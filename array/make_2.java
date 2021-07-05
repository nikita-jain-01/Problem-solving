import java.util.*;

class make_2 {
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
        int[] result = make2(ar, br);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] make2(int[] a, int[] b) {
        int[] num = new int[a.length + b.length];
        int i, j = 0;
        for (i = 0; i < a.length; i++) {
            num[j] = a[i];
            j++;
        }
        for (i = 0; i < b.length; i++) {
            num[j] = b[i];
            j++;
        }
        int[] res = new int[2];
        res[0] = num[0];
        res[1] = num[1];
        return res;
    }

}