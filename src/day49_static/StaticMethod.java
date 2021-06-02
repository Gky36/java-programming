package day49_static;

public class StaticMethod
{
    int num1 = 10;
    static int count= 5;
    public static void displayMessage(String message)
    {
        System.out.println("message = " + message);
       // System.out.println("num = "+num); //ERROR: num is instance variable static cannot accept
        System.out.println("count = " + count);
    }

    public static void anotherStaticMethod()
    {
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }

    //Static Methods.instanceMethod(); >no
    //StaticMethods stm =new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod()
    {
        System.out.println("instanceMethod");
        System.out.println("num = "+num1);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");

    }
}
