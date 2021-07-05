import java.util.*;

class unlucky_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        boolean result = unlucky1(ar);
        System.out.println(result);
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length > 1) {
            if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
                return true;
            else if ((nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3))
                return true;
            else
                return false;
        } else
            return false;
    }

}