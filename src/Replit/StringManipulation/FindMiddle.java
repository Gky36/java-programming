package Replit.StringManipulation;

import java.util.*;

public class FindMiddle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int middleLetter=word.length()/2;

        if (word.length()%2!=0 && word.length()>=3)
        {
            System.out.println(word.charAt(middleLetter));
        }
        else if (word.length()==1)
        {
            System.out.println(""+word.charAt(0)+word.charAt(0)+word.charAt(0));
        }
        else if (word.length()%2==0 && word.length()>=4)
        {
            System.out.println(""+word.charAt(middleLetter-1)+word.charAt(middleLetter));
        }
        else if (word.length()==2)
        {
            System.out.println(""+word.charAt(0)+word.charAt(1)+word.charAt(0)+word.charAt(1));
        }
    }
}
