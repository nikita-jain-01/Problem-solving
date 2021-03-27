/*
Input -> 5

Output -> Number of days present in 5 month is 31
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12)
            System.out.print("Number of days present in "+n+" month is 31");
        else if(n==2)
            System.out.print("Number of days present in "+n+" month is 28");
        else
            System.out.print("Number of days present in "+n+" month is 30");
    }
}