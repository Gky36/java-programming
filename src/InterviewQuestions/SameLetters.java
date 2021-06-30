package InterviewQuestions;

import java.util.Arrays;

public class SameLetters
{
    /**
     * Write a return method that check if a string is build out of the same letters as another string.
     *
     * Ex:  same("abc",  "cab"); -> true 
     *
     * same("abc",  "abb"); -> false:
     */

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cba"));
    }

    public static boolean sameLetters(String word1, String word2)
    {
        char[] a1 = word1.toCharArray();
        char[] a2 = word2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        String newWord1= "";
        for (char each : a1)
        {
            newWord1 += each;
        }

        String newWord2 = "";
        for (char each: a2)
        {
            newWord2 += each;
        }
        return newWord1.contains(newWord2);
    }

    // this is second way
    public static boolean sameLetters2(String str1, String str2) {

        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains("" + str1.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
