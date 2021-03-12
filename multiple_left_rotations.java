/*
Input -> 5
         1 3 5 7 9

Output -> 3 5 7 9 1 
          7 9 1 3 5 
          9 1 3 5 7 
          3 5 7 9 1
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        int i,d,j,temp,k;
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        int[] arr1=new int[n];
        for(k=0;k<4;k++)
        {
            for(i=0;i<n;i++)
                arr1[i]=ar[i];
            d=scan.nextInt();
            for(i=0;i<d;i++)
            {
                temp=arr1[0];
                for(j=1;j<n;j++)
                    arr1[j-1]=arr1[j];
                arr1[n-1]=temp;
            }
            for(i=0;i<n;i++)
                System.out.print(arr1[i]+" ");
            System.out.println();
        }        
    }
}