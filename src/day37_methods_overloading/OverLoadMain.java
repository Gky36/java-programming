package day37_methods_overloading;

public class OverLoadMain
{
    public static void main(String[] different)
    {
        System.out.println("Hello From Real main methods");
        main(2);
    }

    /*
    overloading main method:
        same name + different parameters
    JDK does not look for this one to run
     */
    public static void main(int num)
    {
        System.out.println("num = "+num);
    }
    public static void main(double num)
    {
        System.out.println(3.2);
    }

}
/*
IQ: Can you overload a main method?

Yes, we can add a new method with main, and have different parameters.
 */