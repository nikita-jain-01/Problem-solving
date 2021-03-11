/*
Input -> 5
         6 8 2 1 4

Output -> -1 1 2 -1 4

Explaination -> expression : if arr contains i else print -1
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
        int[] res=new int[n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==ar[j])
                {
                    res[i]=ar[j];
                    k=0;
                    break;
                }
                else
                    k=1;
            }
            if(k==1)
                res[i]=-1;
        }
        for(i=0;i<n;i++)
            System.out.print(res[i]+" ");
    }
}