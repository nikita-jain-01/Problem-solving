/*
Input   ->  5

5 Even numbers -> 0 2 4 6 8

Output  ->  6 (Sum of numbers which are divisible by 3)
*/




import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
int i,k=0;
for(i=0;i<n;i++)
{
  if(k%3==0)
    sum=sum+k;
  k=k+2;
}
System.out.println(sum);
 }
}