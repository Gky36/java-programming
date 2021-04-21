package Replit.ForLoopsArray;

import java.util.Scanner;

public class SplitEmail
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String []emailArray= email.split("@");
        if (emailArray.length==2)
        {
            System.out.println("Email id: "+emailArray[0]);
            System.out.println("Email domain: "+emailArray[1]);
        }
        else
        {
            System.out.println("invalid email");
        }

    }
}
