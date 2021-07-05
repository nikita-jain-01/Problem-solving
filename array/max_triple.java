import java.util.*;

class max_triple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int result = maxTriple(ar);
        System.out.print(result);
    }

    public static int maxTriple(int[] nums) {
        if (nums[0] > nums[nums.length - 1] && nums[0] > nums[nums.length / 2])
            return nums[0];
        else if (nums[nums.length / 2] > nums[nums.length - 1] && nums[0] < nums[nums.length / 2])
            return nums[nums.length / 2];
        else
            return nums[nums.length - 1];
    }

}