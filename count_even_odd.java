/*
Input -> 5
         5 3 2 7 6

Output -> Even numbers: 2
          Odd numbers: 3
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j,even=0,odd=0;
        int[] ar=new int[n];
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        for(i=0;i<n;i++)
        {
            if(ar[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}