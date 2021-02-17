/*
Input   ->  6
            1234
            456
            12
            1
            0045
            0
Output  ->  Not Equal
            Not Equal
            Not Equal
            Equal
            Not Equal
            Equal
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
        int no,sum=0,x;
        no=n;
        while(n!=0)
        {
          x=n%10;
          sum=sum*10+x;
          n=n/10;
        }
        if(sum==no)
          System.out.println("Equal");
        else
          System.out.println("Not Equal");
        t--;
      }
    }
}