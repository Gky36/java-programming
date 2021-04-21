package day35_methods_with_param;

public class MethodsWithInputs_02
{
    public static void main(String[] args)
    {
      displayValue(5);
      displayValue(2);
      displayValue(7);

      int count=55;
      displayValue(count);

      greetByName("Gokay");
      String name ="Saim";
      greetByName(name);
    }

    public static void displayValue(int num)
    {
        System.out.println("value is "+num);
    }

    public static void greetByName(String name)
    {
        System.out.println("Hello "+name+" How are you today?");
    }
}
