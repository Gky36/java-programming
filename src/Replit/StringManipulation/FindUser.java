package Replit.StringManipulation;

import java.util.Scanner;

public class FindUser
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");

        String userFirst=scan.nextLine();


        if(userFirst.equalsIgnoreCase("Max Payne") || userFirst.equalsIgnoreCase("Alan Wake"))
        {
            System.out.println(" User found!");
        }
        else
        {
            System.out.println("User not found!");
        }

    }
}
