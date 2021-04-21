package day10_shorthand_operator;

import java.util.Scanner;

public class WeatherToday_01
{
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.nextLine();
        System.out.println(weather+"- is a nice day");
    }
}/*
     next()=> string and only accept String until first space
     nextLine()=> whole sentence => There is a small BUG/ GLITCH with nextline();
 if we use nextLine() right after nextInt, nextDouble... it will take that
 new line char/ enter and will ignore our string.
*/