package OfficeHours.Practice_03_23;

public class SalaryCalculator
{
    public static void main(String[]args)
    {
        double hourlyrate=10;
        int weeklyHours=40;
        int numberOfweeks=52;


        if (hourlyrate<0 || hourlyrate==0)
        {
            System.out.println("Hourly Rate cannot be Negative or Zero");
            if (weeklyHours==0 ||weeklyHours<0 || weeklyHours>65)
            {
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
                if (numberOfweeks<1 || numberOfweeks>52)
                {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }
            }
        }
        else
        {
            double salary;
            salary=hourlyrate*weeklyHours*numberOfweeks;
            System.out.println(salary+" Salary");
        }

    }
}
/*
Given the following information: hourly rate, weekly hours, and number of weeks.
Check if all the inputs are valid and then calculate the salary.
- hourly rate cannot be negative or zero
-> If invalid print: Hourly Rate cannot be Negative or Zero

- weekly hours cannot be zero, negative or more than 65
-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65

- number of weeks cannot be less than 1 and more than 52
-> If invalid print: Number of weeks cannot be less than 1 or greater than 52
Equation: salary = hourly rate * weekly hours * number of weeks
 */