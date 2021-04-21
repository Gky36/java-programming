package day14_multi_branch_if_statements;

import java.util.Scanner;

public class DayActivity_05
{
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("How is the weather today");
        String weather=scan.nextLine();
        if(weather.equals("sunny"))
        {
            System.out.println(weather+" Go to park, hiking, and code java");
        }
        else if (weather.equals("rainy"))
        {
            System.out.println(weather+" Stay home, drink tea, and code java");
        }
        else if (weather.equals("snowy"))
        {
            System.out.println(weather+" Clean the car then build snowman, drink hot chocalate, and code java");
        }
        else if (weather.equals("windy"))
        {
            System.out.println(weather+" Get ready for power loss, fly a kite, and code java");
        }
        else
        {
            System.out.println("jUST KEEP CODING JAVA");
        }
    }
}
