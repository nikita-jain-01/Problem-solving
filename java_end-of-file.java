/*
Input   ->  Hello world
            I am a file
            Read me until end-of-file.

Output  ->  1 Hello world
            2 I am a file
            3 Read me until end-of-file.
*/




import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=1;
        while(scan.hasNext())
        {
            System.out.println(i+" "+scan.nextLine());
            i++;
        }
    }
}