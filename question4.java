package test1;
//class has one instance block and static method wap execute them in a Static block
class Kiran
{
    {
        System.out.println("instance block");
    }
    static void car()
    {
        System.out.println("car is a static method");
    }
    static
    {
        Kiran o=new Kiran();
        Kiran.car();
    }
}
public class question4 {
    public static void main(String[] args) {
        Kiran o2=new Kiran();
    }
}
