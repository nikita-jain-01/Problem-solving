/*
Input   ->  1
            3

Output  ->  3

Input   ->  -1
            2

Output  ->  java.lang.Exception: Breadth and height must be positive
*/




import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
static Scanner scan=new Scanner(System.in);
static int B=scan.nextInt();
static int H=scan.nextInt();
static boolean flag=true;
static{
    try{
    if(B<=0 || H<=0)
    {
        flag=false;
        throw new Exception("Breadth and height must be positive");
    }
} 
catch(Exception e)
    {
        System.out.println(e);
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}	
	}
}