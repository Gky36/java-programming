package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars_10
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("ENTER Cents: ");
        int cents =scan.nextInt();
        int dollars =cents/100;
        int remainingCents= cents%100;

        System.out.println("Cents = " + cents);
        System.out.println("Dollars = " + dollars);
        System.out.println("RemainingCents = " +remainingCents);
        //IN 123 CENT: 1 dollars 23 cents
        System.out.println("In "+cents+" Cents:"+dollars+" Dollars "+remainingCents+" Cents");

    }
}

// Refactoring the code: update existing working code, in order to improve it, adding a additional features
// Debugging code: looks for bugs in the code and try to fix them