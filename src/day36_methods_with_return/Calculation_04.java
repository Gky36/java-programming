package day36_methods_with_return;

public class Calculation_04
{
    public static void main(String[] args)
    {
        System.out.println(Calculator_03.add(10,45));
        System.out.println(Calculator_03.minus(10,5));
        System.out.println(Calculator_03.multiply(10,2));
        System.out.println(Calculator_03.divide(10,2));

        double d1 =234.3;
        double d2 =321.5;
        double result = Calculator_03.minus(d1, d2);
        System.out.println("result = "+result);
    }
}
