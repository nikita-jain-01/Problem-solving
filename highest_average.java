/*
Input   ->  5
            20 50 60 40 70

Output  ->  70
            25
*/




import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
       s = input.nextInt();
      int[] arr = new int[s];   
      for(i=0;i<arr.length;i++)
	  {
	arr[i]=input.nextInt();
        }
int max,sum=0;
max=arr[0];
for(i=0;i<s;i++)
{
  if(max<arr[i])
    max=arr[i];
}
for(i=0;i<s;i++)
  sum=sum+arr[i];
mark_avg=sum/s;
System.out.println(max);
System.out.println(mark_avg);
 }
}