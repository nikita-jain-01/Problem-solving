/*
Input   ->  10 20
Output  ->  20 10
*/




import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int x=scan.nextInt();
    int y=scan.nextInt();
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println(x+"\n"+y);
  }
}