package Replit.ArrayList;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourOrLess
{
    /*
    FourorlessGivenanArrayList of Strings, go through and read only Strings that are 4 characters or less.
    Take those Strings and put them into a different ArrayListEx:Input:
    “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”Output:[ tree, loop, cat ]
     */

    public static void main(String[] args)
    {
       List<String> str= Arrays.asList("apples","tree","loop","cat","animal");
       List<String> fourOrLess= new ArrayList<>();
       for (int i=0; i<str.size(); i++)
       {
           if (str.get(i).length()<=4)
           {
               fourOrLess.add(str.get(i));
           }
       }
        System.out.println(fourOrLess);
    }
}
