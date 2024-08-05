package test1;
//there is a class it has two instancwe varibles and two static varibles
//wap to execute  them in same class constructor
class Pilot
{
    String pilotname;
    int pilotage;
    static String pilotfrndname;
    static int phno;
    Pilot()
    {
        this.pilotname="Aruna";
        this.pilotage=85;
        Pilot.pilotfrndname="Shree";
        Pilot.phno=108;
        System.out.println(pilotname);
        System.out.println(pilotage);
        System.out.println(pilotfrndname);
        System.out.println(phno);
    }
}

public class Queston7 {
    public static void main(String[] args) {
        Pilot o=new Pilot();
    }
}
