package Replit.Methods;

import java.util.Scanner;

public class ReturnProfitOrLost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }

    public static String profits(int buyPrice, int sellPrice)
    {
        if (buyPrice<sellPrice)
        {
            return "profit";
        }
        else if (buyPrice>sellPrice)
        {
            return "loss";
        }
        else
        {
            return "no loss";
        }
    }

}
/*
Finish the profits method which accepts the buyPrice(int) and sellPrice(int) and determines
if there was a profit or loss.

It returns a string value that can be "profit","loss","no loss"
 */