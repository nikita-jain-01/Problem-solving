/*
Input   ->  203

Output  ->  0
*/




import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
int num1,num2,sum=0,count=0,a,j,mul=1;
num1=n;
num2=n;
while(n!=0)
{
 count++;
  n=n/10;
}
while(num1!=0)
{
  mul=1;
  a=num1%10;
  for(j=1;j<=count;j++)
    mul=mul*a;
  sum=sum+mul;
  num1=num1/10;
}
if(sum==num2)
  result=1;
else
  result=0;
System.out.println(result);
 }
}