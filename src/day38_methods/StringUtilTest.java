package day38_methods;

//import all static methods. so that you can just call by method name, without classname
import static day38_methods.StringUtils.*;

public class StringUtilTest
{
    public static void main(String[] args)
    {
      String userName="";
      if (StringUtils.isNullOrEmpty(userName))
      {
          System.out.println("Username cannot be null or empty");
      }

        System.out.println("ispalindrome(civic)  = "+StringUtils.isPalindrome("civic"));
        System.out.println("ispalindrome(kayak) = "+StringUtils.isPalindrome("kayak"));
        System.out.println("ispalindrome(Cybertek) = "+isPalindrome("Cybertek"));

        System.out.println(StringUtils.reverse("java"));

        String word= "gokay";
        String reverseWord=StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("reverseWord = " + reverseWord);

    }


}
