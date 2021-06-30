import java.util.*;

class array_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int sum = array6(ar, 0);
        System.out.println(sum);
    }

    public static int array6(int[] nums, int index) {
        if (index == nums.length)
            return 0;
        else {
            if (nums[index] == 6)
                return 1 + array6(nums, index + 1);
            else
                return array6(nums, index + 1);
        }
    }

}