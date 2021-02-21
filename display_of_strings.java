/*
Input   ->  1
            CodeQuotient
Output  ->  CodeQuotient
*/




import java.util.Scanner;
class Main{
    static void display(String a)
    {
    System.out.println(a);
    }
    static void display(String a, String b)
    {
    System.out.println(a+"-"+b);
    }
    public static void main(String[] args)
    {
        int n;
        String a,b;
        Main o1=new Main();
        Scanner s=new Scanner(System.in);
        n = Integer.parseInt(s.nextLine());
        if(n==1)
        {
            a = s.nextLine();
            display(a);
        }
        else
        {
            a = s.nextLine();
            b = s.nextLine();
            display(a,b);
        }
    }
}