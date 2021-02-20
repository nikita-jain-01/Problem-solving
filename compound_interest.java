/*
Input   ->  1000 5 2
Output  ->  1102.5
*/




import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
      float p=scan.nextFloat();
      float r=scan.nextFloat();
      float t=scan.nextFloat();
      double amount=Math.round((p*(Math.pow((1+(r/100)),t)))*10)/10.0;
      System.out.println(amount);
    }
}