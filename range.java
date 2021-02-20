/*
Input   ->  3 7
Output  ->  25
*/




import java.util.Scanner;
class Main{
    static int sumOfRange(int min, int max)
    {
      if(min>max)
        return 0;
      else
      {
        int i,sum=0;
        for(i=min;i<=max;i++)
          sum=sum+i;
        return sum;
      }
    }
    public static void main(String[] args)
    {
      int T, min, max;
      Scanner s = new Scanner(System.in);
      T = Integer.parseInt(s.nextLine());
      while(T>0)
      {
        min = Integer.parseInt(s.nextLine());
        max = Integer.parseInt(s.nextLine());
    
        System.out.println(sumOfRange(min, max));
        T = T-1;
      }
    }
}    