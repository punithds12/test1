package test1;
//if a class contains instance block and constructor wap execute instance block and constructor?
class Suraj
{
    {
        System.out.println("instance block");
    }
    Suraj()
    {
        System.out.println("constructor ");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Suraj o=new Suraj();

    }
}
