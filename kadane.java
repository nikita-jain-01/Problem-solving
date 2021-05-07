/*
Input -> 6
         -8 6 5 -5 6 -2
Output -> 15
*/


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        int i, j, sum = 0, max = 0;
        for (i = 0; i < n; i++)
            ar[i] = scan.nextInt();
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = i; j < n; j++)
                sum = sum + ar[j];
            if (max < sum)
                max = sum;
        }
        System.out.println(max);
    }
}