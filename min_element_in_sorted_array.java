/*
Input -> 5
         4 8 6 2 8

Output -> 2
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
        int min=Integer.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            if(min>ar[i])
                min=ar[i];
        }  
        System.out.println(min);      
    }
}