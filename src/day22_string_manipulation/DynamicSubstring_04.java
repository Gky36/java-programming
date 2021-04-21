package day22_string_manipulation;

public class DynamicSubstring_04
{
    public static void main(String[] args)
    {
        String result="result count:12345";
        System.out.println(result.substring(13));

        //find the index of
        System.out.println(result.indexOf(":"));
        int colonIndex=result.indexOf(":");
        System.out.println(result.substring(colonIndex+1));

        //now we can combine them into 1 statement
        System.out.println(result.substring(result.indexOf(":")));

        String today=" i learned [java] today";
        int firstIndex =today.indexOf("[");
        int secondIndex=today.indexOf("]");
        System.out.println(today.substring(firstIndex+1,secondIndex ));

        //System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));

    }
}
