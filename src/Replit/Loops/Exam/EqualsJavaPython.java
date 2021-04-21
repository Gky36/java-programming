package Replit.Loops.Exam;

import java.util.Scanner;

public class EqualsJavaPython
{
    public static void main(String[] args)
    {
/*
Given a string, print out true if the number of appearances of
"java" anywhere in the string is equal to the number of appearances of "python"
anywhere in the string (case sensitive).
 */
        Scanner scan=new Scanner(System.in);
        String sentence=scan.nextLine();
        int java=0;
        int python=0;

        for (int i=0;i<sentence.length()-3;i++)
        {
            String fourLetter=sentence.substring(i,i+4);

            if (fourLetter.equals("java"))
            {
                java++;
            }
        }
        for (int i=0; i<sentence.length()-5;i++)
        {
            String sixthLetter=sentence.substring(i, i+6);
            if (sixthLetter.equals("python"))
            {
                python++;
            }
        }
        System.out.println(java==python);

    }
}
