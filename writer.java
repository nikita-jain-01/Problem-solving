import java.util.Scanner;
class Writer
{
  String name;
  String email;
  char gender;
  public Writer(String n,String e,char g)
  {
    name=n;
    email=e;
    gender=g;
  }
  public String toString()
  {
    return "Writer[name="+name+",email="+email+",gender="+gender+"]";
  }
}

class Book
{
  String name;
  Writer writer;
  Double price;
  int quantity;
  public Book(String n,Writer w,Double p,int q)
  {
    name=n;
    writer=w;
    price=p;
    quantity=q;
  }
  public String toString()
  {
    return "Book[name="+name+",Writer[name="+writer.name+",email="+writer.email+",gender="+writer.gender+"],price="+price+",qty="+quantity;
  }
  public void setPrice(Double p)
  {
    this.price=p;
  }
  public void setQty(int q)
  {
    this.quantity=q;
  }
  public String getName()
  {
    return this.name;
  }
  public Double getPrice()
  {
    return this.price;
  }
  public int getQty()
  {
    return this.quantity;
  }
}
class Main{
    public static void main(String[] args)
    {
      // Construct an author instance
      String a1,a2,a3;
      double d1;
      int n1,n2;
      Scanner s1=new Scanner(System.in);
      a1=s1.nextLine();
      a2=s1.nextLine();
      a3=s1.nextLine();
      Writer w1 = new Writer(a1, a2, a3.charAt(0));
      System.out.println(w1);  // Writer's toString()
      a1=s1.nextLine();
      d1=s1.nextDouble();
      n1=s1.nextInt();
      Book dummyBook = new Book(a1, w1, d1, n1);  // Test Book's Constructor
      System.out.println(dummyBook);  // Test Book's toString()
  
      // Test Getters and Setters
      d1=s1.nextDouble();
      n1=s1.nextInt();
      dummyBook.setPrice(d1);
      dummyBook.setQty(n1);
      System.out.println("name is: " + dummyBook.getName());
      System.out.println("price is: " + dummyBook.getPrice());
      System.out.println("qty is: " + dummyBook.getQty());
    }
  }