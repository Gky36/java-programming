package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord
{
    /*
    Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
    Ex:Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”
    Target:java
    Output:2
     */
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "html","css", "java", "javascript","selenium"));
        String targetWord="java";
        int count=0;
        for(String each: list)
        {
            if (each.equals(targetWord))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
