/*
Input -> 5
         5 3 2 7 6

Output -> Minimum number: 2
          Maximum number: 7
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,max,min;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        int[] ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(i=0;i<n;i++)
        {
            if(max<ar[i])
            max=ar[i];
            if(min>ar[i])
            min=ar[i];
        }
        System.out.println("Minimum number: "+min);
        System.out.println("Maximum number: "+max);
    }
}