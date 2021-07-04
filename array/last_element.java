import java.util.*;

class last_element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int[] result = makeLast(ar);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] makeLast(int[] nums) {
        int[] res = new int[2 * nums.length];
        res[2 * nums.length - 1] = nums[nums.length - 1];
        int i;
        for (i = 0; i < 2 * nums.length - 1; i++)
            res[i] = 0;
        return res;
    }

}