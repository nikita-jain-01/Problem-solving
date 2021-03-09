/*
Input -> 5
         1 2 3 4 5
         9

Output -> 9 sum is present by adding (5, 4)
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        int i,d,j,x=0,y=0,k=0,sum=0;
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        d=scan.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum=ar[i]+ar[j];
                if(sum==d)
                {
                    k=1;
                    x=ar[i];
                    y=ar[j];
                    break;
                }
            }
        }
        if(k==1)
            System.out.println(d+" sum is present by adding ("+x+", "+y+")");
        else
            System.out.println(d+" is not present");
    }
}