package SaimExamples.SwitchExampl;

import java.util.Scanner;

public class HouseBuyer
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Neighborhood: ");
        String neighborhood=scan.nextLine();
        int averagePrice=0;
        double rating=0;
        boolean gated=false;
        boolean allowPets=true;

        switch (neighborhood)
        {
            case "Hills":
                averagePrice =89_000;
                rating=4.0;
                gated=false;
                allowPets=true;
               // System.out.println("Average Price: $"+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets: "+allowPets);
                break;
            case "Oaks":
                averagePrice=75000;
                rating=3.5;
                gated=false;
                allowPets=true;
                break;
            case "Highland":
                averagePrice=150_000;
                rating=4.5;
                gated=true;
                allowPets=false;
                //System.out.println("Average Price: $"+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets: "+allowPets);
                break;
            case "Canyon":
                averagePrice=201000;
                rating=4.8;
                gated=false;
                allowPets=true;
              //  System.out.println("Average Price: $"+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets: "+allowPets);
                break;
            default:
                System.out.println("Invalid neighborhood");
        }
        System.out.println("Average Price: $"+averagePrice+"\nRating: "+rating+"\nGated: "+gated+"\nAllow Pets: "+allowPets);

    }
}

