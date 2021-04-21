package Replit.ForLoopsArray;

import java.util.Scanner;

public class SplitSentence
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] sentenceArra=sentence.split(" ");

        for (String each: sentenceArra)
        {
            System.out.println(each);
        }
    }
}
