package day35_methods_with_param;

import java.util.*;

public class MultipleParams_04
{
    public static void main(String[] args)
    {
       Scanner input= new Scanner(System.in);
        System.out.println("Enter 2 double number: ");
        double d1=input.nextDouble();
        double d2=input.nextDouble();
        showSum(d1,d2);

      showSum(25.7,2.5);
    }
    public static void showSum(double num1, double num2)
    {
        double sum=num1+num2;
        System.out.println("The Sum = "+sum);
    }
}
