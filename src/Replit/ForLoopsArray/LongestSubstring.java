package Replit.ForLoopsArray;

import java.util.*;

public class LongestSubstring
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        String longestString="";

        for(int i = 0; i < 5;  i++)
        {
            words[i] = input.nextLine();
        }

        for (String str :words)
        {
            if (str.length()>longestString.length())
            {
                longestString=str;
            }
        }
        System.out.println(longestString);
    }
}
