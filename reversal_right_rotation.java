/*
Input -> 5
         6 9 4 2 9

Output -> 6 9 4 2 9
          2 9 6 9 4
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,temp,d=0,count=0,min=1000;
        int[] ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
        int k=scan.nextInt();
        d=n-k-1;
        for(i=0;i<d;i++)
        {
            temp=ar[n-1];
            for(j=n-2;j>=0;j--)
                ar[j+1]=ar[j];
            ar[0]=temp;
        }
        System.out.println();
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}