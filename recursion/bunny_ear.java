import java.util.*;

class bunny_ear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = bunnyEars(x);
        System.out.println(sum);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0)
            return 0;
        else
            return 2 + bunnyEars(bunnies - 1);
    }

}