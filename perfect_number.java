/*
Input -> 6

Output -> 6 is a perfect number
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(sum==n)
        System.out.print(n+" is a perfect number");
        else
        System.out.print(n+" is not a perfect number");
    }
}