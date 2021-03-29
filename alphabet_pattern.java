/*
Input -> 10

Output -> A 
          B C 
          D E F
          G H I J
          K L M N O
          P Q R S T U
          V W X Y A B C
          D E F G H I J K
          L M N O P Q R S T
          U V W X Y A B C D E
*/


import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=65;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)k+" ");
                k++;
                if(k==90)
                    k=65;
            }
            System.out.println();
        }
    }
}