/*
Input   ->  1239
Output  ->  2340
*/
import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int new_no=0,final_no=0;
    int no=0,i,j=1;
    while(n!=0)
    {
      i=n%10;
      if(i==9)
        no=0;
      else
        no=i+1;
      new_no=new_no+no*j;
      j=j*10;
      n=n/10;
    }
    System.out.println(new_no);
  }
}