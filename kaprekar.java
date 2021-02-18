/*
Input   ->  4
            45
            13
            1
            9
Output  ->  1
            0
            1
            1
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
      int t=scan.nextInt();
      while(t!=0)
      {
        int n=scan.nextInt();
        int mul=1,sum=0;
        mul=n*n;
        if(n>=0 && n<=9)
        {
          int second=mul%10;
          int first=mul/10;
          sum=first+second;
        }
        else if(n>=10 && n<=99)
        {
          int second=mul%100;
          int first=mul/100;
          sum=first+second;
        }
        else if(n>=100 && n<=999)
        {
          int second=mul%1000;
          int first=mul/1000;
          sum=first+second;
        }
        else
        {
          int second=mul%10000;
          int first=mul/10000;
          sum=first+second;
        }
          if(sum==n)
            System.out.println("1");
          else
            System.out.println("0");
        t--;
      }
    }
}