package OfficeHours.Practice_03_24;

import day12_conditioanl_statements.IFElseStatement_02;

public class AccountNumber
{
    public static void main(String[] args)
    {
        String accountNumber="2020000";

        if (accountNumber.startsWith("2"))
        {
            if (accountNumber.length()==7)
            {
                System.out.println("Valid 2 digit account number");
            }
            else
            {
                System.out.println("Not a valid 2 digit account number");
            }
        }
        else if (accountNumber.startsWith("5"))
        {
            if (accountNumber.length()==10)
            {
                System.out.println("Valid 10 digit account number");
            }
            else
            {
                System.out.println("Not a valid 10 digit account number");
            }
        }
        else
        {
            System.out.println("Not a valid number");
        }
    }
}
