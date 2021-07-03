import java.util.*;

class middle_elements {
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
        int[] result = middleWay(ar, br);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] res = new int[2];
        res[0] = a[a.length / 2];
        res[1] = b[b.length / 2];
        return res;
    }

}