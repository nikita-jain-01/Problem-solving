import java.util.*;

class common_end {
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
        boolean result = commonEnd(ar, br);
        System.out.println(result);
    }

    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
            return true;
        else
            return false;
    }

}