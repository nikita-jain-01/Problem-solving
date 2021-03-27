/*
Input -> 5 15

Output -> 6 7 8 9 10 11 12 13 14
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int second=scan.nextInt();
        if(first>0 && second>0)
        {
            for(int i=first+1;i<second;i++)
                System.out.print(i+" ");
        }
    }
}