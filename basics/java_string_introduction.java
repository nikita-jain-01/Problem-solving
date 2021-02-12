/*
Input   ->  hello
            java
Output  ->  9
            No
            Hello Java
*/




import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int l=A.length()+B.length();
        System.out.println(l);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
System.out.print(A.substring(0, 1).toUpperCase()+A.substring(1, A.length()));
System.out.print(" "+ B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));
    }
}