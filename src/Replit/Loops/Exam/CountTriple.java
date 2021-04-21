package Replit.Loops.Exam;

import java.util.Scanner;

public class CountTriple
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;

        for (int i=0;i<str.length()-2;i++)
        {
            String triple=str.substring(i,i+3);

           //asagidaki satiri yazmassam eger 3 char ayni oldugunu anlayamayiz
            String sameChar=""+triple.charAt(0)+triple.charAt(0)+triple.charAt(0);
            if (triple.equals(sameChar))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
