package Replit.StringManipulation;

import java.util.Scanner;

public class PrintFirstLetterAndLast
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        char firstLetter=word.charAt(0);
        char lastLetter=word.charAt(word.length()-1);
        System.out.println(firstLetter+""+lastLetter);

    }
}
