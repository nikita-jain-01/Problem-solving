/*
Input -> 5
         6 5 3 2 9

Output -> 6 5 3 2 9
          3
          2 9 6 5 3
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,temp,d=0,count=0,min;
        int[] ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
        min=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            if(min>ar[i])
            {
                min=ar[i];
                d=i;
            }
        }
        for(i=0;i<d;i++)
        {
            temp=ar[0];
            for(j=1;j<n;j++)
                ar[j-1]=ar[j];
            ar[n-1]=temp;
            count++;
        }
        System.out.println();
        System.out.println(count);
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }
}