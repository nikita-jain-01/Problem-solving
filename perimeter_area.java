/*
Input   ->  2.5

Output  ->  15.707963267948966
            19.634954084936208
*/



import java.util.Scanner;  
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
if(radius<=0)
      System.out.println("please enter non zero positive number");
else
{
      area=Math.PI*radius*radius;
  	  perimeter=2*Math.PI*radius;    
      System.out.println(perimeter);
      System.out.println(area);
}
  }
}