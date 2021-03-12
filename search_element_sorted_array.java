/*
Input  -> 5
          2 6 5 9 8
          9

Output -> 3
*/




import java.util.*;
public class HelloWorld{
     public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        int i,d,j;
        for(i=0;i<n;i++)
            ar[i]=scan.nextInt();
        d=scan.nextInt();
        for(i=0;i<d;i++)
        {
            int temp=ar[n-1];
            for(j=n-2;j>=0;j--)
                ar[j+1]=ar[j];
            ar[0]=temp;
        }
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
     }
}