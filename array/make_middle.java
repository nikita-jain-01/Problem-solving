import java.util.*;

class make_middle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int[] result = makeMiddle(ar);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] makeMiddle(int[] nums) {
        int left = nums[nums.length / 2 - 1];
        int right = nums[nums.length / 2];
        int[] res = new int[2];
        res[0] = left;
        res[1] = right;
        return res;
    }

}