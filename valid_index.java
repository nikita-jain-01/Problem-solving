/*
Input   ->  10
            1 2 3 4 5 6 7 8 9 10
            4
            13

Output  ->  5
            Out of Bounds
*/




import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
      	Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
      int i,a,b;
      	int[] arr=new int[t];
      	for(i=0;i<t;i++)
          arr[i]=scan.nextInt();
      	a=scan.nextInt();
      	b=scan.nextInt();
      	if(a<t)
          System.out.println(arr[a]);
      	else
          System.out.println("Out of Bounds");
        if(b<t)
          System.out.println(arr[b]);
      	else
          System.out.println("Out of Bounds");
    }
}