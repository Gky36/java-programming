package SaimExamples.SwitchExampl;

import java.util.Scanner;

public class Author
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter Genre:");
        String genre=scan.nextLine();

        int pageLength=0;
        int profit=0;
        int sequels=0;
        int numberOfCountriesPublish=0;

        switch (genre)
        {
            case "Fantasy":
                pageLength +=500;
                profit +=1_000_000;
                sequels +=5;
                numberOfCountriesPublish +=50;
                System.out.println("Page Length= "+pageLength+"\nProfit= $"+profit+"\nSequels= "+sequels+"\nFCountries Of Published= "+numberOfCountriesPublish);
                break;
            case "Detective":
                pageLength=350;
                profit=700_000;
                sequels=3;
                numberOfCountriesPublish+=45;
                System.out.println("Page Length= "+pageLength+"\nProfit= $"+profit+"\nSequels= "+sequels+"\nFCountries Of Published= "+numberOfCountriesPublish);
                break;
            case "Science Fiction":
                pageLength=720;
                profit=900500;
                sequels=4;
                numberOfCountriesPublish=30;
                System.out.println("Page Length= "+pageLength+"\nProfit= $"+profit+"\nSequels= "+sequels+"\nFCountries Of Published= "+numberOfCountriesPublish);
                break;
            case "Short Story":
                pageLength=150;
                profit=300000;
                sequels=1;
                numberOfCountriesPublish=40;
                System.out.println("Page Length= "+pageLength+"\nProfit= $"+profit+"\nSequels= "+sequels+"\nFCountries Of Published= "+numberOfCountriesPublish);
                break;
            default:
                System.out.println("Not information published");
        }

    }
}

