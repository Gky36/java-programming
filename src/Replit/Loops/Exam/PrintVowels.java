package Replit.Loops.Exam;

import java.util.Scanner;

public class PrintVowels
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String vowels="";

        for (int i=0;i<word.length();i++)
        {
            char eachLetter=word.charAt(i);

            if (eachLetter=='a')
            {
                vowels+=eachLetter+"";
            }
            else if (eachLetter=='e')
            {
                vowels+=eachLetter+"";
            }
            else if (eachLetter=='u')
            {
                vowels+=eachLetter+"";
            }
            else if (eachLetter=='i')
            {
                vowels+=eachLetter+"";
            }
            else if (eachLetter=='o')
            {
                vowels+=eachLetter+"";
            }
        }
        System.out.println("vowels = " + vowels);
    }
}
