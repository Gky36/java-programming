package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod_03
{
    public static void main(String[] args)
    {
        String words ="java:python:selenium:html";
        String wordArray[]= words.split(":");
        System.out.println(Arrays.toString(wordArray));
        System.out.println("length of array: "+wordArray.length);

        for (String each :wordArray)
        {
            System.out.println(each);
        }

        String sentence="today I am coding java arrays";
        String sentenceArray[]= sentence.split(" ");
        System.out.println("first word: "+wordArray[0]);
        System.out.println("first word: "+sentence.split(" ")[0]);
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("length of array: "+sentenceArray.length);

        for (String str :sentenceArray)
        {
            System.out.println(str);
        }
        System.out.println();

    }
}

/*
    SPLIT- String class method:

    Split- break into pieces/ chunks in English
    Split method in Java ===> splits String into Array items, by using the delimiter.
 */