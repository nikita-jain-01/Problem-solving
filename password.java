import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    int d=0;
    Scanner scan=new Scanner(System.in);
    String user=scan.nextLine();
    String pass=scan.nextLine();
    if(pass.length()<6)
      System.out.println("Too short!");
    else
    {      
     for(int i=0;i<pass.length();i++)
     {
       char ch=pass.charAt(i);
       if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9')
       {
         d=1;
         break;
       }
     }
      if(d==1)
        System.out.println("Correct");
      else
        System.out.println("No digit!");
    }
  }
}