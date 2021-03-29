/*
Input -> 5
         2 5 9 8 2

Output -> 2 5 9 8
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,even=0,odd=0;
        int[] ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(ar[i]==ar[j])
                ar[j]=-1;
            }
        }
        for(i=0;i<n;i++)
        {
            if(ar[i]!=-1)
            System.out.print(ar[i]+" ");
        }
    }
}