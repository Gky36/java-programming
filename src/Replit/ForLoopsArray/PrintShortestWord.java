package Replit.ForLoopsArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] strArr= str.split(", ");
        String smallestWord=strArr[0];

        for (String each : strArr)
        {
            if (smallestWord.length()> each.length())
            {
                smallestWord=each;
            }
        }

        int count=0;
        String s="";
        for (int i =0; i< strArr.length;i++)
        {
            if (smallestWord.length()==strArr[i].length())
            {
                count++;
                s +=strArr[i]+" ";
            }
        }
        String temp[] = s.split(" ");
        Arrays.sort(temp);
        System.out.println(Arrays.toString(temp));
    }
}
