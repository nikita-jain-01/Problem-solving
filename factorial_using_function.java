/*
Input -> 5
Output -> 120
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.print("Factorial of "+n+" is : ");
        fact(n);
    }
    static void fact(int a)
    {
        int mul=1,i;
        for(i=1;i<=a;i++)
            mul=mul*i;
        System.out.print(mul);
    }
}