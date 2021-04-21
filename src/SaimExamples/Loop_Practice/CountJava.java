package SaimExamples.Loop_Practice;
import java.util.Scanner;

public class CountJava
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count=0;

        for (int i=0;i<word.length()-3;i++)
        {
            String fourLetter=word.substring(i,i+4);
            if (fourLetter.equals("java"))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
