package test1;
//can we overload Static methods
class Ravi
{
    static void food(String chicken,int price)
{
    System.out.println("Ravi favourite food:"+chicken);
    System.out.println("Price of chicken:"+price);
}
    static void food(int noOfDishes,String DrinkName)
    {
        System.out.println("Ravi favourite food:"+noOfDishes);
        System.out.println("Favourite Drink:"+DrinkName);
    }

}

public class Question8 {
    public static void main(String[] args) {
        Ravi.food("chicken fry",220);
        Ravi.food(66,"Black Dog");
    }
}
