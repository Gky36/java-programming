package Replit.Loops.Exam;

import java.util.Scanner;

public class Asterisks
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();

        for (int i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
}
