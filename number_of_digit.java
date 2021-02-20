/*
Input   ->  12345
Output  ->  5
*/




import java.util.Scanner;
class Main
{
    public int countDigits(int number)
    {
    int sum=0,a;
    while(number!=0)
    {
        a=number%10;
        sum++;
        number=number/10;
    }
    return sum;
    }

    public static void main(String[] args)
    {
    Main o1 = new Main();
    Scanner s=new Scanner(System.in);
    int t,n;
    t=Integer.parseInt(s.nextLine());
        while(t!=0)
        {
            n=Integer.parseInt(s.nextLine());
            System.out.println(o1.countDigits(n));
            t=t-1;
        }
    }
}