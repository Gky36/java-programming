package day22_string_manipulation;

public class IndexOfExample_02
{
    public static void main(String[] args)
    {
       String technologies="java, html, css, selenium, testng, maven, cucumber";

       // First Comma
        System.out.println(technologies.indexOf(","));
        // Last comma
        System.out.println(technologies.lastIndexOf(","));

        // for middle one, we need to loop
        int indexOfJava=technologies.indexOf("java");
        System.out.println("java = " + indexOfJava);

        int idxOfCss= technologies.indexOf("css");
        System.out.println("css is at index = " + idxOfCss);

        int idxCucumber=technologies.indexOf("cucumber");
        System.out.println("Cucumber is at index = " + idxCucumber);

        int indexOfSql=technologies.indexOf("Sql");
        System.out.println("Index Of Sql = " + indexOfSql);

        //technologies contains maven

        if (technologies.contains("maven"))
        {
            System.out.println("maven is present");
        }
        else
        {
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1)
        {
            System.out.println("maven is present");
        }
        else
        {
            System.out.println("maven is not present");
        }


    }
}
/*
    CharAt(index) vs indexOf(string)
        charAt reads a character at certain index
        indexOf searches for string and return index number

        CharAt returns -> char (single character)at gives position
        indexOf return -> int (index number) for the string

        indexOf method:
            WHEN FOUND
                -> return int index position number which is ALWAYS 0 or more
            WHEN NOT FOUND
                -> return -1


 */