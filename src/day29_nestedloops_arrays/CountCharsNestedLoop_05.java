package day29_nestedloops_arrays;

public class CountCharsNestedLoop_05
{
    public static void main(String[] args)
    {

        String word = "java";

        for(int outer = 0; outer < word.length(); outer++)
        {
            int count = 0;
            char eachLetter=word.charAt(outer);
            for(int inner = 0; inner < word.length(); inner++)
            {
              char eachLetter2=word.charAt(inner);
                if(eachLetter==eachLetter2)
                {
                    count++;
                }
            }
            System.out.println(eachLetter +"="+count);
        }
    }
}
