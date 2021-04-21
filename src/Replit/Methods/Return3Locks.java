package Replit.Methods;

import java.util.Scanner;

public class Return3Locks
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));

    }

    public static boolean threeLocks(boolean a, boolean b, boolean c)
    {
        if (a==b)
        {
            return true;
        }
        else if (c)
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
threeLocks accepts 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.
 */