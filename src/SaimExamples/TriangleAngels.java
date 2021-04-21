package SaimExamples;

public class TriangleAngels
{
    public static void main(String[] args)
    {
        // 3 tane variable tanimliyoruz cunku triangle 3 tane kisim var
      int angles1=10;
      int angles2=30;
      int angles3=50;
      int sum= angles1+angles2+angles3;

      //if((angles1+angles2+angles3) ==180)
      //boolean check=((angles1+angles2+angles3) ==180);
        if (sum==180)
      {
          System.out.println("Valid triangle");
      }
      else
      {
          System.out.println("it is not valid");
      }
    }
}

/*
        A triangle is valid if the sum of all the three angles is equal to 180 degrees.
        Write a program that declares three integers as angles and check whether the triangle is valid or not.
         Print "Valid triangle" or "Not a valid triangle".

    => To make it dynamic change the three angles to be Scanner inputs
 */