package SaimExamples.String_Practice;

public class CreatingEmail
{
    public static void main(String[] args)
    {
      String email="I am so happy with string manipulation";
      String email2="java is a lot of fun";

      if (email.length()>=6 && email2.length()>=6)
      {
          char firsLetter=email.charAt(0);
          char secondLetter=email.charAt(1);
          char thirdLetter=email.charAt(2);
          char fourtLetter=email.charAt(3);

          int count=email2.length();
          char lastLetter=email2.charAt(count-1);
          char lastLetter2=email2.charAt(count-2);
          char lastLetter3=email2.charAt(count-3);
          String add="cybertek.com";
          System.out.println(""+firsLetter+secondLetter+thirdLetter+fourtLetter+lastLetter3+lastLetter2+lastLetter+add);

      }
      else
      {
          System.out.println("Invalid data");
      }

    }
}
