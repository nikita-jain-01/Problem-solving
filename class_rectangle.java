/*
Input   ->  1
Output  ->  5
            2
            7
            3
            Rectangle[x=5,y=2,width=7,height=3]
            13
            27
            2
            42
            Rectangle[x=13,y=27,width=2,height=42]
            2
            3
            4
            5
            Rectangle[x=2,y=3,width=4,height=5]
*/




import java.util.Scanner;
class Rectangle
{
  int x,y,width,height;
  Rectangle(int a,int b,int c,int d)
  {
    this.x=a;
    this.y=b;
    this.width=c;
    this.height=d;
  }
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public int getWidth()
  {
    return width;
  }
  public int getHeight()
  {
    return height;
  }
  public String toString()
  {
    return ("Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]");
  }
}
class Main
{
  public static void main(String[] args)
  {
    Rectangle r1=new Rectangle(5,2,7,3);
    Rectangle r2=new Rectangle(13,27,2,42);
    Rectangle r3=new Rectangle(2,3,4,5);

    System.out.println(r1.getX());
    System.out.println(r1.getY());
    System.out.println(r1.getWidth());
    System.out.println(r1.getHeight());
    System.out.println(r1.toString());

    System.out.println(r2.getX());
    System.out.println(r2.getY());
    System.out.println(r2.getWidth());
    System.out.println(r2.getHeight());
    System.out.println(r2.toString());

    System.out.println(r3.getX());
    System.out.println(r3.getY());
    System.out.println(r3.getWidth());
    System.out.println(r3.getHeight());
    System.out.println(r3.toString());
}
}