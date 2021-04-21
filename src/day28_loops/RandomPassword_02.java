package day28_loops;

import java.util.Random;
import java.util.Scanner;

public class RandomPassword_02
{
    public static void main(String[] args)
    {
      String source="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
      Random random= new Random(); // helps generato random number
      String password="";

      for (int i=1; i<=8; i++)
      {
          int index=random.nextInt(71); // random num 0-70
          // source.substring(index, index + 1); bu da substring yapilmis hali
         //add the char to password variable using +=
          password+=source.charAt(index);
          //asagida yaptigimizin amaci random num print etmek
          //System.out.print(source.charAt(index));
      }
        System.out.println("Your password = " + password);
    }
}
