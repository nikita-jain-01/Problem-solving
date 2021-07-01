import java.util.*;

class first_last_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        int sum = FirstLast6(ar);
        System.out.println(sum);
    }

    public static boolean FirstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6)
            return true;
        else
            return false;
    }

}