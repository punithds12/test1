package test1;
//There are two classes 1 class has instance method and another class has
// constructor wap executes nthe instance method in constructor
class Bike
{
  void Bikename(String bikeName)
  {
      System.out.println(" Instance method bike name" +bikeName);
  }
}
class Aeroplane
{
    Aeroplane()
    {
        Bike o=new Bike();
        o.Bikename("ducati");
    }

}
public class Question6 {
    public static void main(String[] args) {
        Aeroplane o2=new Aeroplane();
    }
}
