import java.util.*;

class fix_3_after_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int[] result = fix23(ar);
        for (i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }

    public static int[] fix23(int[] nums) {
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3)
                nums[i + 1] = 0;
        }
        return nums;
    }

}