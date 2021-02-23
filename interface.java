/*
Input   ->  1
Output  ->  68kmph
            58kmph
*/




interface Vehicle 
{
  void changeGear(int a);
  void speedUp(int a);
  void applyBrakes(int a);
}
class Car implements Vehicle
{
  int speed=0;
  public void changeGear(int a)
  {
   int speed=a;
  }
  public void speedUp(int a)
  {
  this.speed=this.speed+a;
  }
  public void applyBrakes(int a)
  {
  this.speed=this.speed-a;
  }
  public String toString()
  {
  return this.speed+"kmph";
  }
}
class Bike implements Vehicle
{
  int speed=0;
  public void changeGear(int a)
  {
  int speed=a;
  }
  public void speedUp(int a)
  {
  this.speed=this.speed+a;
  }
  public void applyBrakes(int a)
  {
  this.speed=this.speed-a;
  }
  public String toString()
  {
  return this.speed+"kmph";
  }
}
class Main
{
  public static void main(String[] args)
  {
    Car c1 = new Car();
    Bike b1 = new Bike();

    c1.changeGear(5);
    c1.speedUp(80);
    c1.applyBrakes(12);
    System.out.println(c1);
  	b1.changeGear(3);
    b1.speedUp(60);
    b1.applyBrakes(2);
    System.out.println(b1);
  }
}