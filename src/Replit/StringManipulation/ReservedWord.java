package Replit.StringManipulation;

import java.util.Scanner;

public class ReservedWord
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //String reverse



        if (word.length()<5)
        {
            System.out.println("Too short!");
        }
        else if (word.length()>5)
        {
            System.out.println("Too long!");
        }
        else if (word.length()==5)
        {
            char lastLetter=word.charAt(4);
            char lastLetter2=word.charAt(3);
            char lastLetter3=word.charAt(2);
            char lastLetter4=word.charAt(1);
            char lastLetter5=word.charAt(0);

            String reserve=""+lastLetter+""+lastLetter2+""+lastLetter3+""+lastLetter4+""+lastLetter5;
            System.out.println(reserve);
        }
    }
}
