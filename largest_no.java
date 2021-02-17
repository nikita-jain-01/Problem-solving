/*
Input ->  10 20 30
Output  ->  30
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
      	int a=scan.nextInt();
      	int b=scan.nextInt();      	
      	int c=scan.nextInt();
      if(a>b & a>c)
        System.out.print(a);
      else if(b>a && b>c)
        System.out.print(b);
      else
        System.out.print(c);
    }
}