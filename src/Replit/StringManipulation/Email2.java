package Replit.StringManipulation;

import java.util.Scanner;

public class Email2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName=email.substring(email.indexOf(0)+1,email.indexOf("_"));
        firstName=email.substring(0,1).toUpperCase()+firstName.substring(1);

        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));
        
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Domain: " + domain);











/*
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        lastName=email.substring(0,1).toUpperCase()+email.substring(1);

        String domain=email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);

 */
    }
}
