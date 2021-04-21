package OfficeHours.Practice_03_22;

import java.util.Scanner;

public class PersonalInfo
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("How many people they live with ?");
        int people = scan.nextInt();
        System.out.println(people);
        if (people<2)
        {
            System.out.println("Live with less than 2 people");
        }
        else if (people>3 && people<6)
        {
            System.out.println("Live with 3 - 6 people");
        }
        else
        {
            System.out.println("Live with more than 6 people");
        }

        System.out.println("What city they live in ?");
        scan.nextLine();
        String city=scan.nextLine();
        System.out.println(city);

        System.out.println("Do you want to live in downtown ?");
        //scan.nextLine();
        String downtown=scan.nextLine();
        System.out.println(downtown);

        if (downtown.equals("yes") || downtown.equals("YES"))
        {
            System.out.println("Have you thought about moving to the suburbs?");
            String moving="yes";
            if (moving.equals("yes") || moving.equals("YES"))
            {
                System.out.println("do it its great");
            }
            else
            {
                System.out.println("You should think about it");
            }
        }
        System.out.println("what is your favorite animal");
        String animal=scan.nextLine();
        System.out.println("Wow "+animal+ " is a great animal");
        System.out.println("How many pets they want?");
        int pets=scan.nextInt();
        System.out.println("Interesting, do you want"+pets+" "+animal+" ?");

    }
}
