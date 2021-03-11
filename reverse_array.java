/*
Input -> 5
         6 4 8 2 9

Output -> 8 2 9 6 4
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,temp,d=0,k=0;
        int[] ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
        d=scan.nextInt();
        for(i=0;i<d;i++)
        {
            temp=ar[0];
            for(j=1;j<n;j++)
                ar[j-1]=ar[j];
            ar[n-1]=temp;
        }
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}