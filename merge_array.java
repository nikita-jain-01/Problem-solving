/*
Input -> 5 5
         1 2 3 7 8
         9 4 5 6 0
Output -> 0 1 2 3 4 5 6 7 8 9
*/

import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int i,j=0,k,temp;
        int[] ar1=new int[m];
        int[] ar2=new int[n];
        int[] res=new int[m+n];
        for(i=0;i<m;i++)
        {
            ar1[i]=scan.nextInt();
            System.out.print(ar1[i]+" ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            ar2[i]=scan.nextInt();
            System.out.print(ar2[i]+" ");
        }
        for(i=0;i<m;i++)
        {
            res[j]=ar1[i];
            j++;
        }
        for(i=0;i<n;i++)
        {
            res[j]=ar2[i];
            j++;
        }
        for(i=0;i<j-1;i++)
        {
            for(k=i+1;k<j;k++)
            {
                if(res[i]>res[k])
                {
                    temp=res[i];
                    res[i]=res[k];
                    res[k]=temp;
                }
            }
        }
        System.out.println();
        for(i=0;i<j;i++)
            System.out.print(res[i]+" ");
    }
}