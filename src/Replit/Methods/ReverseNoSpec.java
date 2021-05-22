package Replit.Methods;

import java.util.Scanner;

public class ReverseNoSpec {
    /*
Create a method reverseNoSpec(String) that will reverse a string without affecting special characters

Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));
    }

    public static String reverseNoSpec(String str) {
        String temp = "";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isLetter(str.charAt(i))) {
                temp += str.charAt(i);
            }
        }

        for (int i = 0, j = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                result += str.charAt(i);
            } else {
                result += temp.charAt(j);
                j++;
            }
        }
        return result;
    }
}
