package Replit.Loops.Exam;

import java.util.Scanner;

public class PrintTriangle
{
    public static void main(String[] args)
    {
//Write a program that will create a triangle of asterisks based on size n.

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String triangle="";

        for (i=1;i<=n;i++)
        {
           triangle +="*";
           System.out.println(triangle);
        }
    }
}
