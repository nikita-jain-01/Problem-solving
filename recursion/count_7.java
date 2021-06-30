import java.util.*;

class count_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = count7(x);
        System.out.println(sum);
    }

    public static int count7(int n) {
        if (n < 7)
            return 0;
        else {
            if (n % 10 == 7)
                return 1 + count7(n / 10);
            else
                return count7(n / 10);
        }
    }

}
