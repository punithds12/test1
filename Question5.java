package test1;
//a class has one instance method and static method wap execute them in a contructor
class Railways
{
    void ticket(String trainname,int time)
    {
        System.out.println("Train name:"+trainname);
        System.out.println("train time:"+time);
        System.out.println("instance method");
    }
    static void department()
    {
        System.out.println("department Static method");
    }
    Railways()
    {
        this.ticket("Brindavan",11);
        Railways.department();
    }
}
public class Question5 {
    public static void main(String[] args) {
        Railways o2=new Railways();

    }
}
