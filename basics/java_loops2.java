/*
Input   ->  2
            0 2 10
            5 3 5

Output  ->  2 6 14 30 62 126 254 510 1022 2046
            8 14 26 50 98
*/




import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0,j,k=1;
            sum=a+b*1;
            System.out.print(sum+" ");
            for(j=1;j<n;j++)
            {
                k=k*2;
                sum = sum + b*k;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}