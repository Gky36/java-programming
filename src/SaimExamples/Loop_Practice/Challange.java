package SaimExamples.Loop_Practice;

import java.util.Random;

public class Challange
{
    public static void main(String[] args)
    {
        /*
CHALLENGE – THIS WILL MAY BE DIFFICILT BUT TRY IT. DON’T SPEND TOO MUCH TIME
Generate a random number that is six digits long. Each digit in this number should be unique,
meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
HINTS: Loops, Strings, Random
         */

        Random random =new Random();
        String pasword="";

        for (int i=0;i<6;i++)
        {
            int index=random.nextInt(7);

            pasword+=index+"";
        }
        System.out.println(pasword);

    }
}
