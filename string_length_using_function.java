/*
Input -> Hello_CodeTrophs

Output -> 16
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int l=length(str);
        System.out.print(l);
    }
    static int length(String st)
    {
        int i=0,j=0;
        for(i=0;i<st.length();i++)
        j++;
        return j;
    }
}