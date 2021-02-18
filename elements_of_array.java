/*
Input   ->  3
            10 
            20 
            4
            7
            1
            2
            3
            4
            5
Output  ->  5
            4
            3
            2
            1
            7
            4
            20
            10
            3
*/




import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int[] ar=new int[10];
    int i;
    for(i=0;i<10;i++)
      ar[i]=scan.nextInt();
    for(i=9;i>=0;i--)
      System.out.println(ar[i]);
  }
}