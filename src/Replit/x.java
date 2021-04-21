package Replit;

import java.util.*;

public class x
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstLetter=word.charAt(0);
        char lastLetter=word.charAt(word.length()-1);

        if ((firstLetter=='x' ||firstLetter=='X')&&(lastLetter=='X' || lastLetter=='x'))
        {
            System.out.println(word.substring(1,word.length()-1));
        }
        else if (firstLetter=='x' || firstLetter=='X')
        {
            System.out.println(word.substring(1));
        }
        else if (lastLetter=='x' ||lastLetter=='X')
        {
            System.out.println(word.substring(0,word.length()-1));
        }
        else
        {
            System.out.println(word);
        }
        
    }
}
