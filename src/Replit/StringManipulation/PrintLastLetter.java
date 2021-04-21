package Replit.StringManipulation;
import java.util.Scanner;
public class PrintLastLetter {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        char lastLetter = word.charAt(word.length() - 1);
        System.out.println(lastLetter);
    }
}