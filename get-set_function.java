/*
Input   ->  1
Output  ->  5
            4
            10.0
*/




class Triangle
{
    int base, height;
    void setbaseheight(int b, int h)
    {
    this.base=b;
    this.height=h;
    }
    float area()
    {
    return (base*height)/2;
    }
    int getBase()
    {
    return base;
    }
    int getHeight()
    {
    return height;
    }
}

class Main{
  public static void main(String[] args)
  {
    Triangle o1 = new Triangle();
    o1.setbaseheight(5,4);
    System.out.println(o1.getBase());
    System.out.println(o1.getHeight());
    System.out.println(o1.area());
  }
}