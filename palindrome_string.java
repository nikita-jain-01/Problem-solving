/*
Input   ->  Mom and Dad are my best friends
Output  ->  2
*/




import java.util.*;
class Main
{
    static int countPalindrome(String str)
    {
    str=str+" ";
        String word="";
    int i,count=0;
    for(i=0;i<str.length();i++)
    {
        char ch=str.charAt(i);
        if(ch!=' ')
        word=word+ch;
        else
        {
        if(checkPalin(word))
            count++;
        word="";
        }
    }
    return count;
    }

    static boolean checkPalin(String word)
    {
    int i;
    int n=word.length();
    word=word.toLowerCase();
    for(i=0;i<n;i++,n--)
    {
        if(word.charAt(i)!=word.charAt(n-1))
        return false;
    }
        return true;
    }

    public static void main(String[] args)
    {
    int j=0;
    String a;
    Scanner s=new Scanner(System.in);
    a = s.nextLine().trim();
    j=countPalindrome(a);
    System.out.println(j);
    }
}