/*
Input   ->  2 5
Output  ->  2
            4
            6
            8
            10
*/




import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int no=scan.nextInt();
    int table=scan.nextInt();
    int i;
    for(i=1;i<=table;i++)
      System.out.println(no*i);
  }
}