package day29_nestedloops_arrays;

public class StringNestedLoop_04
{
    public static void main(String[] args)
    {
      String word="java";

      for (int i=0;i<word.length();i++)
      {
          for (int j=0; j<=i; j++)
          {
              System.out.print(word.charAt(j)+" ");
          }
          System.out.println();
      }

      /*
      Print :
      java
      ava
      va
      a
       */

        for (int i=0;i<word.length();i++)
        {
            for (int j=i;j<word.length();j++)
            {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }


    }
}
