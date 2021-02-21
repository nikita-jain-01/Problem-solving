/*
Input   ->  3
            3 4 5
Output  ->  12
*/




import java.util.Scanner;
class Main{
    int sum(int a,int b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }

    public static void main(String[] args)
    {
        int n,a,b,c,d;
        Main o1=new Main();
        Scanner s=new Scanner(System.in);
        n = Integer.parseInt(s.nextLine());
        if(n==2)
        {
            a=Integer.parseInt(s.nextLine());
            b=Integer.parseInt(s.nextLine());
            System.out.println(o1.sum(a,b));
        }
        else if(n==3)
        {
            a=Integer.parseInt(s.nextLine());
            b=Integer.parseInt(s.nextLine());
            c=Integer.parseInt(s.nextLine());
            System.out.println(o1.sum(a,b,c));
        }
        else
        {
            a=Integer.parseInt(s.nextLine());
            b=Integer.parseInt(s.nextLine());
            c=Integer.parseInt(s.nextLine());
            d=Integer.parseInt(s.nextLine());
            System.out.println(o1.sum(a,b,c,d));
        }
    }
}