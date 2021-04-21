package day18_conditions_practice_strings_intro;

public class ThreeNumber_05
{
    public static void main(String[] args)
    {
      int num1=100;
      int num2=440;
      int num3=11;

      if (num1>=num2 && num1>=num3)
      {
          System.out.println(num1+" biggest number");
      }
      else if (num2>=num1 && num2>=num3)
      {
          System.out.println(num2+" biggest number");
      }
      else
      {
          System.out.println(num3+" biggest number");
      }
    }
}
