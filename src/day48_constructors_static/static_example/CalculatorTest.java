package day48_constructors_static.static_example;

public class CalculatorTest
{
    public static void main(String[] args)
    {
      // add is static methods, can be called using Classname.staticMethodName
      //static way of calling of the method
      Calculator.add(5,3);

      // Calculator.multiply(2, 4) ERROR: mulitply is not static need object to call it
      //multiple is instance method and we creating object then calling it
      Calculator calculator = new Calculator();
      calculator.multiply(2,4);


    }
}
