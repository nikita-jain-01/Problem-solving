import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    String id;
    int count=0,k;
    Scanner s1=new Scanner(System.in);
    id=s1.nextLine();
    for(int i=0;i<id.length();i++)
    {
      char ch=id.charAt(i);
      if(ch=='@')
      {
        count++;
        for(k=i;k<id.length();k++)
        {
          char ch1=id.charAt(k);
          if(ch1=='.')
            count++;
        }
      }
    }
    if(count==2)
      System.out.println("Valid");
    else
      System.out.println("Invalid");
  }
}