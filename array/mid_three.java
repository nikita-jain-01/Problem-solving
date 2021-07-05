import java.util.*;

class mid_three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int[] result = midThree(ar);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] midThree(int[] nums) {
        int[] res = new int[3];
        res[0] = nums[nums.length / 2 - 1];
        res[1] = nums[nums.length / 2];
        res[2] = nums[nums.length / 2 + 1];
        return res;
    }

}