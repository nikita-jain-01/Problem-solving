/*
Input   ->  10 2
Output  ->  2
            3
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
      int upto=scan.nextInt();
      int sum=scan.nextInt();
      int i,count=0,j,k=0;
      for(i=2;i<=upto;i++)
      {
        count=0;
        for(j=1;j<=i;j++)
        {
          if(i%j==0)
            count++;
        }
        if(count==2)
        {
          System.out.println(i);
          k++;
        }
        if(k==sum)
          break;
      }
    }
}