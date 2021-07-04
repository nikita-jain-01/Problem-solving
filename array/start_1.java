import java.util.*;

class start_1 {
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
        int result = start1(ar, br);
        System.out.println(result);
    }

    public static int start1(int[] a, int[] b) {
        int i, count = 0;
        if (a.length > 0) {
            if (a[0] == 1)
                count++;
        }
        if (b.length > 0) {
            if (b[0] == 1)
                count++;
        }
        return count;
    }

}