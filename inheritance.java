/*
Input   ->  1
Output  ->  Code
            Code
            Quotient
            newcqcq
*/




class A {
    public void m1() {
        System.out.println("Coding");
    }
    public void m2() {
        System.out.println("Quotient");
    }
    public String toString() {
        return "cq";
    }
}

class B extends A {
    public void m1() {
        System.out.println("Code");
    }
    public String toString() {
        return (super.toString() + super.toString());
    }
}

class C extends B
{
  public void m1()
  {
      super.m1();
  }
  public void m2()
  {
  	  super.m1();
      super.m2();
  }
  public String toString()
  {
  	return ("new"+super.toString());
  }
}

class Main
{
  public static void main(String[] args)
  {
    C c=new C();
    c.m1();
    c.m2();
    System.out.println(c.toString());
  }
}