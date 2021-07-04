import java.util.*;

class plus_two_array {
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
        int[] result = plusTwo(ar, br);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i, j = 0;
        for (i = 0; i < a.length; i++) {
            res[j] = a[i];
            j++;
        }
        for (i = 0; i < b.length; i++) {
            res[j] = b[i];
            j++;
        }
        return res;
    }

}