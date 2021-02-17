/*
Input   ->  11
Output  ->  Odd
*/




import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
      	int n=scan.nextInt();
      	if(n%2!=0)
          System.out.print("Odd");
        else
          System.out.print("Even");
    }
}