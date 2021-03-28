/*
Input -> 10

Output -> 0 1
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1,sum=0,count=2;
        if(n==1)
            System.out.print(a+" ");
        else if(n==2)
            System.out.print(b+" ");
        else{
            System.out.print(a+" "+b+" ");
            while(count!=n)
            {
                sum=a+b;
                a=b;
                b=sum;
                System.out.print(sum+" ");
                count++;
            }
        }
    }
}