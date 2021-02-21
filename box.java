/*
Input   ->  3 4 5
Output  ->  0 0 0 0
            3 4 5 60
            3 4 5 60
*/




import java.util.Scanner;
class Box
{
  int length,breadth,height;
  Box()
  {
    
  }
  Box(int l,int b,int h)
  {
    this.length=l;
    this.breadth=b;
    this.height=h;
  }
  Box(Box b)
  {
    this.length=b.length;
    this.breadth=b.breadth;
    this.height=b.height;
  }
  int getLength()
  {
    return length;
  }
  int getBreadth()
  {
    return breadth;
  }
  int getHeight()
  {
    return height;
  }
  long CalculateVolume()
  {
    return length*breadth*height;
  }
}
class Main
{
  public static void main(String[] args)
  {
    int l,b,h;
    Box b1=new Box();
    Scanner s=new Scanner(System.in);
  	l = Integer.parseInt(s.nextLine().trim());
    b = Integer.parseInt(s.nextLine().trim());
    h = Integer.parseInt(s.nextLine().trim());
    Box b2=new Box(l,b,h);
    Box b3=new Box(b2);
    System.out.println(b1.getLength()+" "+b1.getBreadth()+" "+b1.getHeight()+" "+b1.CalculateVolume());
    System.out.println(b2.getLength()+" "+b2.getBreadth()+" "+b2.getHeight()+" "+b2.CalculateVolume());
    System.out.println(b3.getLength()+" "+b3.getBreadth()+" "+b3.getHeight()+" "+b3.CalculateVolume());
  }
}