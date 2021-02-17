/*
Input   ->  4
Output  ->  24
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
      int n,mul=1;
      n=scan.nextInt();
      for(int i=1;i<=n;i++)
        mul=mul*i;
      System.out.println(mul);
    }
}