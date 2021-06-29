import java.util.*;

class bunny_ear2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = bunnyEars2(x);
        System.out.println(sum);
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0)
            return 0;
        else if (bunnies % 2 == 0)
            return 3 + bunnyEars2(bunnies - 1);
        else
            return 2 + bunnyEars2(bunnies - 1);
    }

}
