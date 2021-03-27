/*
Input -> 5 15

Output -> Sum of all numbers: 90
          Sum of all even numbers: 50
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int first=scan.nextInt();
        int second=scan.nextInt();
        int sum=0,e_s=0;
        for(int i=first+1;i<second;i++)
        {
            if(i%2==0)
                e_s=e_s+i;
            sum=sum+i;
        }
        System.out.println("Sum of all numbers: "+sum);
        System.out.println("Sum of all even numbers: "+e_s);
    }
}