import java.util.*;

class array_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int sum = array11(ar, 0);
        System.out.println(sum);
    }

    public static int array11(int[] nums, int index) {
        if (index == nums.length)
            return 0;
        else {
            if (nums[index] == 11)
                return 1 + array11(nums, index + 1);
            else
                return array11(nums, index + 1);
        }
    }

}