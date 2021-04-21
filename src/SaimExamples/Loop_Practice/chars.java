package SaimExamples.Loop_Practice;

public class chars
{
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        int count = 0;
       char firstLetter='a';


        for (int i=0;i<str.length();i++)
        {
            char eachLetter=str.charAt(i);
            if (eachLetter=='a')
            {
                count++;
            }
            else if (eachLetter=='b')
            {
                // another count variable
            }
        }

        System.out.println(count++);
    }
}

/*
Biggest substring of matching characters
Given a String find the biggest substring of chars that match and print it.
Ex: aaabbbcccccddddee Output: ccccc
 */