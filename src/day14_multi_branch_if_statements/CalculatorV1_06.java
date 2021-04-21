package day14_multi_branch_if_statements;

public class CalculatorV1_06
{
    public static void main(String[]args)
    {
        double number1=5.5;
        double number2=2.5;
        char operator='+';

        if(operator=='+')
        {
            System.out.println(number1+number2);
        }
        else if(operator=='-')
        {
            System.out.println(number1-number2);
        }
        else if(operator=='*')
        {
            System.out.println(number1*number2);
        }
        else if(operator=='/')
        {
            System.out.println(number1/number2);
        }
        else
        {
            System.out.println("Invalid operator - "+operator);
        }

    }
}
