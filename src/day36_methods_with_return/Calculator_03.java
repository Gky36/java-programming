package day36_methods_with_return;

public class Calculator_03
{
    public static void main(String[] args)
    {
        System.out.println("Sum = "+add(2.3,3));
        System.out.println("Minus = "+minus(10,2.5));
        System.out.println("Multiply = "+multiply(20,2));
        System.out.println("Divide = "+divide(20,2));
    }

    public static double add(double num1, double num2)
    {
        double sum = num1+num2;
        return sum;
    }
    public static double minus(double num1, double num2)
    {
        double minus=num1-num2;
        return minus;
    }
    public static double multiply(double num1, double num2)
    {
        double multiply= num1 *num2;
        return  multiply;
    }
    public static double divide(double num1, double num2)
    {
        double divide= num1/num2;
        return divide;
    }
}
