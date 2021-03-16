/*
Input -> 5

Output -> 5 is odd.
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2==0)
        System.out.print(n+" is even.");
        else
        System.out.print(n+" is odd.");    
    }
}