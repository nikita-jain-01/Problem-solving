/*
Input -> 145

Output -> 145 is a strong number
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int num=n,sum=0,mul=1,a;
        while(num!=0)
        {
            a=num%10;
            mul=1;
            for(int i=1;i<=a;i++)
            mul=mul*i;
            sum=sum+mul;
            num=num/10;
        }
        if(sum==n)
        System.out.print(n+" is a strong number");
        else
        System.out.print(n+" is not a strong number");
    }
}