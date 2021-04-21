package Replit.StringManipulation;

import java.util.*;
public class Dublicate
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        String dublicateWord= word1+word2+word2+word1;

        if (!word1.equals(word2))
        {
            System.out.println(dublicateWord);
        }
        else
        {
            System.out.println("Not dublicated");
        }
    }
}
