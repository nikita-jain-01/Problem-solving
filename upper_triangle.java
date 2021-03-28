/*
Input -> 3
         1 2 3 4 5 6 7 8 9

Output -> 1 2 3
          0 5 6
          0 0 9
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int[][] ar=new int[m][m];
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            ar[i][j]=scan.nextInt();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(j>=i)
                System.out.print(ar[i][j]+" ");
                else
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
}