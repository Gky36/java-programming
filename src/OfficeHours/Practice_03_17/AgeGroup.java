package OfficeHours.Practice_03_17;

public class AgeGroup
{
    public static void main(String[] args)
    {
        int age=1;

        if(age>120 && age<0) // if(age>120 || age<0)
        {
            System.out.println("invalid entry, and nothing else is checked.");

        }
        else
        {
            if (age<=2)
            {
                System.out.println("Infant");
            }
            else if (age>=3 && age<=5)
            {
                System.out.println("Toddler");
            }
            else if (age>=6 && age<=9)
            {
                System.out.println("Kid");
            }
            else if (age>=10 && age<=12)
            {
                System.out.println("Pre-Teen");
            }
            else if (age>=13 && age<=17)
            {
                System.out.println("Teenager");
            }
            else if (age>=18 && age<=20)
            {
                System.out.println("Young Adult");
            }
        }
    }
}
