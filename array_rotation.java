/*
Input -> 5
         1 2 3 4 5
         2

Output -> 3 4 5 1 2
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
            int temp=ar[0];
            for(j=1;j<n;j++)
                ar[j-1]=ar[j];
            ar[n-1]=temp;
        }
        for(i=0;i<n;i++)
            System.out.print(ar[i]+" ");
     }
}