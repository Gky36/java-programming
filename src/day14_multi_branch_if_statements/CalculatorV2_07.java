package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV2_07
{
    public static void main(String[]args)
    {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter 2 numbers");
       double number1=scan.nextDouble();
       double number2=scan.nextDouble();
       System.out.println("Enter Operator: -, + ,*, /");
       char operator= scan.next().charAt(0);

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
// char kullandigimiz zaman char operator= scan.next().charAt(0);