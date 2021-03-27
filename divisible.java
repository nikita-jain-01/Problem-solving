/*
Input -> 5

Output -> 5 is not divisible by 5 and 11 both
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%5==0 && n%11==0)
            System.out.print(n+" is divisible by both 5 and 11");
        else
            System.out.println(n+" is not divisible by 5 and 11 both");
    }
}