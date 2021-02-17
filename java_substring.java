/*
Input   ->  Helloworld
            3 7

Output  ->  lowo
*/




import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String s1="";
        s1=S.substring(start,end);
        System.out.println(s1);
    }
}