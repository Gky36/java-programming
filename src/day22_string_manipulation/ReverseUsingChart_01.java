package day22_string_manipulation;

public class ReverseUsingChart_01
{
    public static void main(String[] args)
    {
      String word="javA";
      char first =word.charAt(3);
        char second =word.charAt(2);
        char third =word.charAt(1);
        char fourth =word.charAt(0);

        String reverse= ""+fourth+third+second+first;
        System.out.println("reverse = " + reverse);

        String word2 =word.charAt(0)+""+word.charAt(1)+""+word.charAt(2)+word.charAt(3);
        System.out.println("reverse = " + reverse);
        System.out.println("word2 = " + word2);

      //System.out.println(word.charAt(0)+""+word.charAt(1)+""+word.charAt(2)+word.charAt(3));

        if (word.equalsIgnoreCase(reverse))
        {
            System.out.println("Palindrome word");
        }
        else
        {
            System.out.println("Not Palindrome ");
        }
    }
}
