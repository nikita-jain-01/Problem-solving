/*
Input   ->  4
Output  ->  10
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
      int n=scan.nextInt();
      int sum=0,i;
      for(i=1;i<=n;i++)
        sum=sum+i;
      System.out.println(sum);
    }
}