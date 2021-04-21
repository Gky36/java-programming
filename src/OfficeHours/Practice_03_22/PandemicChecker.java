package OfficeHours.Practice_03_22;

import java.util.Scanner;

public class PandemicChecker
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year=scan.nextInt();

        if (year>=1346 && year<=1353)
        {
            System.out.println("The Black Death");
        }
        else if (year>=1665 && year<=1666)
        {
            System.out.println("Great Plague of London 1770-1772: Russian plague 1889-1890: Flu pandemic");
        }
        else if (year==1916)
        {
            System.out.println("American polio epidemic 1918-1920: Spanish Flu");
        }
        else if (year>=2009 && year>=2919)
        {
            System.out.println("H1N1 Swine Flu pandemic 2014-2016: West African Ebola epidemic 2020-2021: COVID-19");
        }
        else
        {
            if (year<0 || year>2021)
            {
                System.out.println("Invalid year");
            }
            else
            {
                System.out.println("No pandemic");
            }
        }
    }
}
