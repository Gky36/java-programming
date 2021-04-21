package day16_switch_ternary;

import java.util.Scanner;

public class Apartment_03
{
    public static void main(String[] args)
    {
        System.out.println("WELCOME TO ADAIRE APARTMENTS");
        System.out.println("Please Enter the number of Bedroom:");
        Scanner scan= new Scanner(System.in);

        int bedrooms=scan.nextInt();
        double startingPrice=0;
        switch (bedrooms)
        {
            case 0:
                System.out.println("For studio: ");
                startingPrice +=1454;
             break;
            case 1:
                System.out.println("For 1 Bedroom: ");
                startingPrice +=1725;
                break;
            case 2:
                System.out.println("For 2 Bedroom: ");
                startingPrice +=2899;
                break;
            default:
                System.out.println("Thank you I am not interested");

                //return: EXIT MAIN Method

        }
        System.out.println("$"+startingPrice);
    }
}
/*
        SWITCH STATEMENTS NOTES:
        =>  it can only perform ==(equals) comparison. Can not handle any other comparison. >, <, >=, !=
   **** =>  works only with **** BYTE, SHORT, CHAR, and INT. STRING and ENUM types. *****
        =>  we add cases for each matching. data type of variable and case must be same.
        =>  we use BREAK; statement at end of each CASE, to exit to switch block
        =>  it is easier to read and maintain, if statement can

        ==============================================
 */