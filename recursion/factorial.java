import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        long mul = factorial(x);
        System.out.println(mul);
    }

    public static int factorial(int n) {
        if (n < 2)
            return 1;
        else
            return n * factorial(n - 1);
    }
}