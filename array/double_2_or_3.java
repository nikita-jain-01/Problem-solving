import java.util.*;

class double_2_or_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[] ar = new int[n];
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        boolean result = double23(ar);
        System.out.println(result);
    }

    public static boolean double23(int[] nums) {
        int c2 = 0, c3 = 0, i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                c2++;
            else if (nums[i] == 3)
                c3++;
        }
        if (c2 >= 2 || c3 >= 2)
            return true;
        else
            return false;
    }

}