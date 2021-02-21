/*
Input   ->  Amitabh
            BROWN
            2
            1965
            Hema
            White
            2
            1975
Output  ->  The person Amitabh is an Actor. He is BROWN in color, has 2 eyes and debut in 1965
            The person Hema is an Actress. She is White in color, has 2 eyes and debut in 1975
*/




import java.util.Scanner;
class Person
{
  String n,c;
  int n_o_e,d_y;
}
class Actor extends Person
{
	Actor(String name,String color,int number_of_eyes,int debut_year)
    {
    	this.n=name;
        this.c=color;
        this.n_o_e=number_of_eyes;
        this.d_y=debut_year;
    }
    public String toString()
    {
    	return ("The person "+n+" is an Actor. He is "+c+" in color, has "+n_o_e+" eyes and debut in "+d_y);
    }
}
class Actress extends Person
{
	Actress(String name,String color,int number_of_eyes,int debut_year)
    {
    	this.n=name;
        this.c=color;
        this.n_o_e=number_of_eyes;
        this.d_y=debut_year;
    }
    public String toString()
    {
    	return ("The person "+n+" is an Actress. She is "+c+" in color, has "+n_o_e+" eyes and debut in "+d_y);
    }
}
class Main{
    public static void main(String[] args)
    {
      String c,n;
      int e, l;
      Scanner s=new Scanner(System.in);
      n = s.nextLine();
      c = s.nextLine();
      e = Integer.parseInt(s.nextLine());
      l = Integer.parseInt(s.nextLine());
      Actor m = new Actor(n,c,e,l);
      n = s.nextLine();
      c = s.nextLine();
      e = Integer.parseInt(s.nextLine());
      l = Integer.parseInt(s.nextLine());
      Actress j = new Actress(n,c,e,l);
      System.out.println(m);
      System.out.println(j);
    }
}