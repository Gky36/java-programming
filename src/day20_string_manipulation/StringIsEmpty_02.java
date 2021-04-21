package day20_string_manipulation;

public class StringIsEmpty_02
{
    public static void main(String[] args)
    {
      String jobtitle="";

        System.out.println(jobtitle.isEmpty());
        System.out.println(jobtitle.length());
        System.out.println(jobtitle.equals("0"));
        System.out.println(jobtitle.equalsIgnoreCase("0"));

        if (jobtitle.isEmpty())
        {
            System.out.println("Job title is missing, please resend");
        }
        else
        {
            System.out.println("Job title looks good");
        }
        if (jobtitle.length()==0)
        {
            System.out.println("Job title is empty");
        }
        else
        {
            System.out.println("job title is not empty");
        }

        System.out.println(jobtitle.equals(""));

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie="carrots";
        System.out.println(veggie.isEmpty());
        if (!veggie.isEmpty())
        {
            System.out.println("we have"+ veggie);
        }

        String word2;
       // System.out.println(word2.isEmpty()); ERROR. Not initialized
    }
}
/*
    3 STEPS TO LEARN ANY METHOD:

    1) what does it accept:
        str.isEmpty();
        str.length();
        str.equals("some other string);
     -> some methods do not accept any inputs, some do.

    2) what does method do:  logic/ purpose of the method:
        isEmpty() -> checks if string is empty, no chars
        length()  -> counts number of characters

    3) what does method return
        isEmpty() ->     boolean
        length ->        int
        toUpperCase() -> String
        Some methods return value and some do not
 */