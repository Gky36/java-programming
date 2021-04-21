package day32_arrays_split;

public class SentenceSplit_04
{
    public static void main(String[] args)
    {
      String sentence="java is fun";
      String word[]=sentence.split(" ");
        System.out.println("1st word "+word[0]);
        System.out.println("2nd word "+word[1]);
        System.out.println("3rd word "+word[2]);
      //  System.out.println("4th word "+word[3]);  out of bound

        for (String each:word)
        {
            System.out.println(each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String googleResultArray[]=googleResult.split(" ");
        System.out.println("count = "+googleResultArray[1]);
        System.out.println("Second = "+googleResultArray[3]);
        System.out.println("Second = "+googleResultArray[3].substring(1));


    }
}
