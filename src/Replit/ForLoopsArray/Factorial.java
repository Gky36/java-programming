package Replit.ForLoopsArray;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result=1;

        for(int i=n; i>0 ; i--)
        {
            result *=i;
        }
        System.out.print(result);
    }
    }

