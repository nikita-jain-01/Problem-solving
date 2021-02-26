/*
Input   ->  code quotient
Output  ->  Code Quotient
*/




import java.util.Scanner;
class Main
{
    static String capitalizeFirstChar(String str)
    {
            char ch[] = str.toCharArray(); 
            for (int i = 0; i < str.length(); i++) {  
                if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
                        ch[i] = (char)(ch[i] - 'a' + 'A'); 
            }
            str = new String(ch);
            return str;
    }
    public static void main(String[] args)
    {
        int t,i,j=0;
        String a, b;
        Scanner s=new Scanner(System.in);
        t=Integer.parseInt(s.nextLine());
        while(t != 0)
        {
            a = s.nextLine();
            b=capitalizeFirstChar(a);
            System.out.println(b);
            t--;
        }
    }
}