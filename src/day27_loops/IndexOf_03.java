package day27_loops;

public class IndexOf_03
{
    public static void main(String[] args)
    {
      String word="github";
      char letter='t';
      int index=-1;
      for (int i=0;i<word.length();i++)
      {
          if (word.charAt(i)==letter)
          {
              index=i;
              break;
          }
      }
      if (index==-1)
      {
          System.out.println(letter+" is not present");
      }
      else
      {
          System.out.println(letter +" is found at index " + index);
        // loop disarisinda print ediyoruz.
      }
    }
}
