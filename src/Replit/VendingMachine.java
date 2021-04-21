package Replit;

import java.util.Scanner;

public class VendingMachine
{
    public static void main(String[] args) {

        System.out.print("Enter cents: ");
        Scanner scan= new Scanner(System.in);
        int cents=scan.nextInt();
        int quarters= cents/25;
        int dimes=cents%25/10;
        int nickels=cents%25%10/5;
        int pennies=cents%25%10%5/1;

        if(100>cents || cents>0)
        {
            System.out.println("Your change is "+quarters+ "quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");
        }
        else
        {
            System.out.println("Invalid cents amount");
        }
    }
}
