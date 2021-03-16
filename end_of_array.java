/*
Input -> 7
         1 2 0 0 5 0 7

Output -> 1 2 5 7 0 0 0
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,temp;
        int[] ar=new int[n];
        for(i=0;i<n;i++)
        {
            ar[i]=scan.nextInt();
            System.out.print(ar[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(ar[i]==0)
            {
                for(j=i;j<n-1;j++)
                    ar[j]=ar[j+1];
                ar[n-1]=0;
            }
            else if(ar[i+1]==0)
            {
                for(j=i+1;j<n-1;j++)
                    ar[j]=ar[j+1];
                ar[n-1]=0;
            }
        }
        System.out.println();
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}