/*
Input   ->  2
            2 3
            1 2 3
            4 5 6
            3 2
            2 3
            1 2
            2 1
            2 2
            12 4
            7 6
            2 3
            2 4 6
            3 5 7
            
Output  ->  10 10
            25 28
            36 68 100
            32 58 84
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
      int r1=scan.nextInt();
      int c1=scan.nextInt();
      int i,j,sum=0,mul=1,k;
      int[][] ar1=new int[r1][c1];
      for(i=0;i<r1;i++)
      {
        for(j=0;j<c1;j++)
          ar1[i][j]=scan.nextInt();
      }
      int r2=scan.nextInt();
      int c2=scan.nextInt();      
      int[][] ar2=new int[r2][c2];
      for(i=0;i<r2;i++)
      {
        for(j=0;j<c2;j++)
          ar2[i][j]=scan.nextInt();
      }
      for(i=0;i<r1;i++)
      {
        for(j=0;j<c2;j++)
        {
          for(k=0;k<c1;k++)
          {
            mul=ar1[i][k]*ar2[k][j];
            sum=sum+mul;
          }
          System.out.print(sum+" ");
          sum=0;
          mul=1;
        }
        System.out.println();
      }
      t--;
    }
  }
}