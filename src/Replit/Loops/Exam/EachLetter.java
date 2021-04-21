package Replit.Loops.Exam;

import java.util.Scanner;

public class EachLetter
{
    public static void main(String[] args)
    {
/*
Given a String, use a loop to print every character from the String on a new line
 */
       Scanner inp=new Scanner(System.in);
       String word= inp.nextLine();

       for (int i=0; i<word.length();i++)
       {
           char eachLetter=word.charAt(i);
           System.out.println(eachLetter+"");
       }

    }
}
