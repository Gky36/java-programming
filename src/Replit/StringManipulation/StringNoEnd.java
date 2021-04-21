package Replit.StringManipulation;

import java.util.Scanner;

public class StringNoEnd
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        //without last Letter
        String lastLetter=txt.substring(0,txt.length()-1);
        System.out.println(lastLetter);
    }
}
