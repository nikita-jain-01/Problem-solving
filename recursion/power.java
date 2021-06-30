import java.util.*;

class power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int p = scan.nextInt();
        int sum = powerN(b, p);
        System.out.println(sum);
    }

    public static int powerN(int base, int n) {
        if (n == 0)
            return 1;
        else
            return base * powerN(base, n - 1);
    }

}
