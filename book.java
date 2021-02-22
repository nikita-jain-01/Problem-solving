/*
Input   ->  Programming-In-C
            150
            1025
            Schildt
            Rock-On
            50
            185
            
Output  ->  Book Title "Programming-In-C", written by "Schildt" has 1025 pages and of 150 rupees.
            CD Title "Rock-On", is of 185 minutes length and of 50 rupees.
*/




import java.util.Scanner;
class Publication
{
  	String title;
  	int price;
}
class Book extends Publication
{
	int pages;
    String writer;
	Book(String ti,int pr,int pa,String wr)
    {
    	this.title=ti;
        this.price=pr;
        this.pages=pa;
        this.writer=wr;
    }
    public void putdata()
    {
    System.out.println("Book Title \""+title+"\", written by \""+writer+"\" has "+pages+" pages and of "+price+" rupees.");
    }
}
class CD extends Publication
{
	int time;
	CD(String ti,int pr,int tim)
    {
    	this.title=ti;
        this.price=pr;
        this.time=tim;
    }
	public void putdata()
    {
    System.out.println("CD Title \""+title+"\", is of "+time+" minutes length and of "+price+" rupees.");
    }
}
class Main
{
  public static void main(String[] args)
  {
    String title, writer;
    int price, pages, time;
    Scanner s1=new Scanner(System.in);
    title=s1.nextLine();
    price=Integer.parseInt(s1.nextLine());
    pages=Integer.parseInt(s1.nextLine());
    writer=s1.nextLine();
    Book b = new Book(title, price, pages, writer);

    title=s1.nextLine();
    price=Integer.parseInt(s1.nextLine());
    time=Integer.parseInt(s1.nextLine());
    CD c = new CD(title, price, time);
    b.putdata();
    c.putdata();
  }
}