package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters
{
    /*
    Count Letters (Similar to Target word, but different layer)
    Given an ArrayList of Strings and a letter (char) print how many times the letter is
     found in the ArrayList elements
    Ex:Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”letter: ‘a’
    Output:6
     */

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        char letter='a';
        int count=0;

        String str= list.toString();
        char[] chrArr= str.toCharArray();

        for(char each: chrArr)
        {
            if (each=='a')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
