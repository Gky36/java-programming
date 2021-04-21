package Replit.Methods;

import java.util.Scanner;

public class Signum
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
    }

    public static void sign(int n)
    {
        if (n>0)
        {
            System.out.print("positive");
        }
        else if (n<0)
        {
            System.out.print("negative");
        }
        else
        {
            System.out.print("zero");
        }
    }
}
