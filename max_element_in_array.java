/*
Input   ->  3
            5
            20
            10
            4
Output  ->  20
*/




import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int[] ar=new int[5];
    int i,max=0;
    for(i=0;i<5;i++)
    {
      ar[i]=scan.nextInt();
      if(max<ar[i])
        max=ar[i];
    }
    System.out.println(max);
  }
}