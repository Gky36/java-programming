package Replit.StringManipulation;

import java.util.Scanner;
public class FindTheLength
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the text:");
        String word=scan.nextLine();;
        //System.out.println(word);
        System.out.println("Length is: "+word.length());
    }
}
