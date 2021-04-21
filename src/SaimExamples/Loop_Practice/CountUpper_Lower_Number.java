package SaimExamples.Loop_Practice;

public class CountUpper_Lower_Number {
    public static void main(String[] args) {
        String text = "2juMp41EEkd4s4";
        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;

        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i)>=65 &&text.charAt(i)<=90)
            {
                upperCase++;
            }
            if (text.charAt(i)>=97 &&text.charAt(i)<=122)
            {
                lowerCase++;
            }
            if (text.charAt(i)>='0' &&text.charAt(i)<='9')
            {
                number++;
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);
    }
}

/*
Count upper, lower, and numbers
Given a String, find and print how many uppercase letter, lowercase letter,
and number are in the String.
Ex:
Input: 2juMp41EEkd4s4 Output:
3 uppercase letters
6 lowercase letters
5 numbers
 */