/*
Input ->  10 20 30 40 50
Output  ->  150 30
*/




import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner scan=new Scanner(System.in);
    int n=5,sum=0,i=0;
    int[] ar=new int[5];
    for(i=0;i<n;i++)
      ar[i]=scan.nextInt();
    for(i=0;i<n;i++)
      sum=sum+ar[i];
    System.out.println(sum+" "+sum/n);
  }
}