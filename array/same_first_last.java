import java.util.*;

class same_first_last {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        boolean result = sameFirstLast(ar);
        System.out.println(result);
    }

    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1])
            return true;
        else
            return false;
    }

}