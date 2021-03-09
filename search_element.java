/*
Input -> 5
         1 2 3 4 5
         2

Output -> 2 is at index 1
*/




import java.util.*;
public class HelloWorld{
     public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        int i,d;
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        d=scan.nextInt();
        for(i=0;i<n;i++)
        {
            if(ar[i]==d)
            {
                System.out.println(d+" is at index "+i);
                break;
            }
        }
     }
}