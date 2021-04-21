package day28_loops;

public class FindUniqueChars_03
{
    public static void main(String[] args)
    {
      String word="javva";
      String unique="";

      for (int i=0;i<word.length();i++)
      {
          // if word.charAt(i) is not contains in unique
          // burda ! kullanmamizin sebebi tekrar etmemesi icin
        if (!unique.contains(word.charAt(i)+""))
        {
            unique+=word.charAt(i);
        }
      }
        System.out.println("nonDublicate = " + unique);
    }
}
/*
    How to check if a char is in String
    we can use contains methods

    contains method accepts String as input
    EX:

    String str="hello";

    str.contains('h') ==> it show ERROR because contains does not accept single char
    char letter ==> 'e'
    str.contains(letter) ==> it show ERROR
    String other ="java";
    word.contain(other.charAt(0))==> this give me ERROR

    if we add + "" ==>> converting a String so it can work
    'a' + " " ==>>will make String as a whole

    +"" ==> is easiest way to CONVERT any PRIMITIVE to a String

    For Ex:

    100 =>int
    100+"" => String

    123.5 ==> dobule
    ""+123.5 ==> String

    char ch='Q';
    ch+"" ==> String

 */