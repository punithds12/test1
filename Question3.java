package test1;
// if a class contain multiple instance block wap execute all instane block
class Punith
{
    {
        System.out.println("1st instane block");
    }
    {
        System.out.println("2nd instance block");
    }
    {
        System.out.println("3rd instance block");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Punith o=new Punith();

    }
}
