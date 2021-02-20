/*
Input   ->  3
Output  ->  1
*/




import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    static int verifyPrime(int n)
    {
    int i,count=0;
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        count++;
    }
    if(count==2)
        return 1;
    else
        return 0;
    }
    public static void main(String[] args)
    {
      int T, m, no;
      Scanner s = new Scanner(System.in);
      T = Integer.parseInt(s.nextLine());
      while(T>0)
      {
        no = Integer.parseInt(s.nextLine());
        m = verifyPrime(no);
        if (m==1)
          System.out.println("PRIME"); 
        else 
          System.out.println("NOT PRIME"); 
        T = T-1;
      }
    }
}