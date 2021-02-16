/*
Input   ->  5000
Output  ->  6500
*/




import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    int gross=0;
    Scanner scan=new Scanner(System.in);
    int basic=scan.nextInt();
    int hra=(10*basic)/100;
    int da=(20*basic)/100;
    gross=basic+hra+da;
    System.out.println(gross);
  }
}