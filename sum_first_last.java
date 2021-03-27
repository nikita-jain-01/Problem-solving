/*
Input -> 15

Output -> 6
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int last=n%10;
        int first=0,sum=0;
        while(n!=0)
        {
            first=n%10;
            n=n/10;
        }
        sum=first+last;
        System.out.println(sum);
    }
}