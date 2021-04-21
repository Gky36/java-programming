package day19_object_strings;

public class CheckCaseMatch_05
{
    public static void main(String[] args)
    {
        String countryCode="usa";

        if (countryCode.equals(countryCode.toUpperCase()))
        {
            System.out.println("Pass - case is correct");
        }
        else
        {
            System.out.println("Fail - case is incorrect");
        }

        String word= "Java";
        String uword =word.toUpperCase();

        System.out.println("word = " + word);
        System.out.println("uword = " + uword);

        if (word.equals(uword))
        {
            System.out.println("Case match");
        }
        else
        {
            System.out.println("case mismatch");
        }
    }
}
