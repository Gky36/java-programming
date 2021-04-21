package day20_string_manipulation;

public class StringReplace_04
{
    public static void main(String[] args)
    {
        String sentence="java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence.replace("string","conditions"));
        System.out.println(sentence.replace("java",""));
    }
}
/*
    REPLACE() method in String class:

    it search in the string and replace with another string.
 */