package day07_arithmetic_operators_casting;

public class OperatorPrecedence_03
{
    public static void main(String[] args)
    {
        System.out.println(10+5);//15
        System.out.println(10+5-3);//12
        System.out.println((2+5)*3);//21


        //System.out.println(10/0);             Cannot divide by ZERO. Error code divided.
        System.out.println(0/10);
        //  in java, if you try to divide any numberr by zero. Error will happen during runtime

        int num = 10;
        //System.out.println(num/0); // error will happen during runtime
        System.out.println(10 /3); // java keep to change.
        System.out.println(5/2); //2  We call it integer Division Problem

        // Use decimal points number double or float
        System.out.println(5.0/2.0); //2.5 result



    }
}
