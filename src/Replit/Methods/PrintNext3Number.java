package Replit.Methods;

import java.util.Scanner;

public class PrintNext3Number
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();

        next3(num);
    }
    public static void next3(int num)
    {
        System.out.println("next 3 are: ");
        for (int i= num+1; i<=num+3; i++)
        {
            System.out.print(i+" ");
        }
    }
}
