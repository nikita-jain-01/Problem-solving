import java.util.*;

class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = fibonacciseries(x);
        System.out.println(sum);
    }

    public static int fibonacciseries(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacciseries(n - 1) + fibonacciseries(n - 2);
    }

}
