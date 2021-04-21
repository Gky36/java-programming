package Replit.Methods;

import java.util.Scanner;

public class WaterTax
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));
    }
    public static double waterTax(double units)
    {
        double bill=0;

        if (units<=50)
        {
            bill=units*0.60;
        }
        else if (50<units && units<100)
        {
            bill=units*0.90;
        }
        else if (150>units && units>100)
        {
            bill=(units *0.90) +50;
        }
        else
        {
            bill=units *0.90 +100;
        }

        return bill;
    }
}
/*
The waterTax method calculates a water bill. The method takes a double and returns a double.

The more water you use the more it will cost you

Cost under 50:

bill = units * 0.60;
bill = units * 0.60;
Cost above 50:

bill = units * 0.90;
bill = units * 0.90;
Cost above 100 the calculation is same as above 50 but an additional 50 fine

Cost above 150 its the same as above 50 but an additional 100 fine
 */