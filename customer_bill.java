import java.util.Scanner;
class Customer
{
  int id;
  String name;
  int discount;
  public Customer(int i,String n,int d)
  {
    id=i;
    name=n;
    discount=d;
  }
  public int getID()
  {
    return id;
  }
  public String getName()
  {
    return name;
  }
  public int getDiscount()
  {
    return discount;
  }
  public void setDiscount(int d)
  {
    discount=d;
  }
  public String toString()
  {
    return name+"("+id+")";
  }
}

class Bill
{
  int id;
  Customer customer;
  Double amount;
  public Bill(int i,Customer c,Double a)
  {
    id=i;
    customer=c;
    amount=a;
  }
  public int getID()
  {
    return id;
  }
  public Customer getCustomer()
  {
    return customer;
  }
  public void setCustomer(Customer c)
  {
    customer=c;
  }
  public Double getAmount()
  {
    return amount;
  }
  public void setAmount(Double a)
  {
    amount=a;
  }
  public int getCustomerID()
  {
    return customer.id;
  }
  public String getCustomerName()
  {
    return customer.name;
  }
  public int getCustomerDiscount()
  {
    return customer.discount;
  }
  public Double getFinalAmt()
  {
    return ((amount)-((amount*customer.discount)/100));
  }
}
class Main
{
  public static void main(String[] args)
  {
    String a1;
    double d1;
    int n1,n2;
    Scanner s1=new Scanner(System.in);
    n1=Integer.parseInt(s1.nextLine());
    a1=s1.nextLine();
    n2=Integer.parseInt(s1.nextLine());
    Customer c1 = new Customer(n1, a1, n2);
    System.out.println(c1.getID());
    System.out.println(c1.getName());
    System.out.println(c1.getDiscount());
    System.out.println(c1);  // Customer's toString()

    n1=Integer.parseInt(s1.nextLine());
    d1=Double.valueOf(s1.nextLine());
    Bill b1 = new Bill(n1, c1, d1);  // Bill's Constructor
    System.out.println(b1.getID());
    System.out.println(b1.getAmount());
    System.out.println(b1.getCustomerName());
    System.out.println(b1.getCustomerDiscount());
    System.out.println(b1.getFinalAmt());
  }
}