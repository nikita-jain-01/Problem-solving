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
Output  ->  59
*/




import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int[] ar=new int[10];
    int i,sum=0;
    for(i=0;i<10;i++)
    {
      ar[i]=scan.nextInt();
      sum=sum+ar[i];
    }
    System.out.println(sum);
  }
}