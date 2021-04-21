package day21_string_manipulation;

public class FirstAndLastTest_03
{
    public static void main(String[] args) {

        String word="mom";
      /*
        if (word.charAt(0)== word.charAt(2))
        {
            System.out.println("it is same");
        }
       */
        char first=word.charAt(0);
        char last = word.charAt(2);

        if (first==last)
        {
            System.out.println("first and last letter match");
        }
        else
        {
            System.out.println("first and last letters mismatch");
        }

        String friend="aziza";

        char firstLetter=friend.charAt(0);
        int count=friend.length();
        char lastLetter=friend.charAt(count-1);

        // char lastLetter=friend.charAt(friend.length()-1);

        System.out.println(firstLetter);
        System.out.println(lastLetter);
        if (firstLetter==lastLetter)
        {
            System.out.println("first and last letter match");
        }
        else
        {
            System.out.println("first and last letters mismatch");
        }

        String word1="java";
        System.out.println(word1.indexOf("j"));
    }
}
