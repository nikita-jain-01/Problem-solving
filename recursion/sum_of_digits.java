import java.util.*;

class sum_of_digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = sumDigits(x);
        System.out.println(sum);
    }

    public static int sumDigits(int n) {
        if (n < 10)
            return n;
        else
            return (n % 10) + sumDigits(n / 10);
    }

}