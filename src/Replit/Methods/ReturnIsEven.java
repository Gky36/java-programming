package Replit.Methods;

import java.util.Scanner;
public class ReturnIsEven
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int n)
    {
        if (n %2 ==0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
/*
isEven accepts a number and checks if it is even.
If the given number is even return true, otherwise return false.
 */