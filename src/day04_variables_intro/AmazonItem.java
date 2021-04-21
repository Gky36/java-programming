package day04_variables_intro;

public class AmazonItem
{
    public static void main(String[] args)
    {
        String description = "HIC wooden spoon";
        String seller = "Amazon.com";
        int ratingsCount = 181;
        double price = 5.99;
        boolean prime = true;

        System.out.println("-------- PRODUCT INFORMATION --------");
        System.out.println(description);
        System.out.print(" * * * * * *");
        System.out.println();
        System.out.println(price);
        System.out.print(" * * * * * *");
        System.out.println();
        System.out.println(ratingsCount);
        System.out.println(seller);
        System.out.println(prime);
    }
}

// Karakterde string kullaniriz.
// Kusuratli rakamlarda her zman double kullaniriz.
// Rakamlarda int kullaniriz.
// Evet yada hayirda boolean kullaniyorz.

// What are variables in programing -> container, storage to store date/values
/*
    Using variables in java:
    -> Declare -> data type
               -> name of variable
    -> Assign value:
               -> assigned operator

    -> data types:
        int, String, double, boolean
 */
