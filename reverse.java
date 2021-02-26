/*
Input   ->  reverse
Output  ->  esrever
*/




import java.util.Scanner;
class Main
{
    static String reverseString(String str)
    {
    String org="";
    int n=str.length();
    for(int i=n-1;i>=0;i--)
        org=org+str.charAt(i);
    return org;
    }

    public static void main(String[] args)
    {
        String str;
        int test;
        Scanner s=new Scanner(System.in);
        test=Integer.parseInt(s.nextLine());
        while(test!=0)
        {
        str=s.nextLine();
        System.out.println(reverseString(str));
        test--;
        }
    }
}