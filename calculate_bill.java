/*
Input   ->  1000
            100
            4
            0
            0
            0
            10
Output  ->  Need to pay: 91900
*/




class Bill
{
Scanner scan=new Scanner(System.in);
  int item_price,quantity,note_2000,note_500,note_100,note_50,note_10;
}
class Cash extends Bill
{
 void get_cash()
 {
  item_price=scan.nextInt();
  quantity=scan.nextInt();
  note_2000=scan.nextInt();
  note_500=scan.nextInt();
  note_100=scan.nextInt();
  note_50=scan.nextInt();
  note_10=scan.nextInt();
 }
 void display()
 {
int mul=1;
mul=(note_2000*2000)+(note_500*500)+(note_100*100)+(note_50*50)+(note_10*10);
 if((item_price*quantity)<mul)
 System.out.println("Clear");
 else
 {
 int total=(item_price*quantity)-mul;
 System.out.println("Need to pay: "+total);
 }
 }
}
class Main
{
  public static void main(String[] args)
  {
    Cash d=new Cash();
    d.get_cash();
    d.display();

  }
}