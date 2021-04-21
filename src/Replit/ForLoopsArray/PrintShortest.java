package Replit.ForLoopsArray;

import java.util.*;

public class PrintShortest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String shortestString=str[0];

        for (String each : str)
        {
            if (each.length()<shortestString.length())
            {
                shortestString=each;
            }
        }
        System.out.println(shortestString.substring(0,shortestString.length()-1));
    }
}
