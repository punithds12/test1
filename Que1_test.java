package test1;
// if a class contains multiple static blocks how to execute them?
class Surya{
    static {
        System.out.println(" this is the 1st static block");
    }
    static {
        System.out.println(" 2nd static block");
    }
    static{
        System.out.println("3rd static block");
    }
}
public class Que1_test {
    public static void main(String[] args) {
        Surya os = new Surya();
    }
}
