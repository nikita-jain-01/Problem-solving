/*
Input -> 4
         1 20 2 10

Output -> 72
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        int i,d,j,x=0,y=0,k=0,sum=0,max=0,temp;
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum=0;
                temp=ar[0];
                for(k=1;k<n;k++)
                    ar[k-1]=ar[k];
                ar[n-1]=temp;
                for(x=0;x<n;x++)
                    sum=sum+ar[x]*x;
                if(max<sum)
                    max=sum;
            }
        }
        System.out.println(max);
    }
}