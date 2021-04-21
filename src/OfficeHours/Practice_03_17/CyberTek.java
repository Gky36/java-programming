package OfficeHours.Practice_03_17;

public class CyberTek
{
    public static void main(String[] args)
    {
        /*
        String batch = "US";

        if (batch.equals("US") ||batch.equals("us"))
        {
            System.out.println("US batch selected");
            if (batch.equals("morning"))
            {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }
            else
            {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }
        }
        else if (batch.equals("EU") || batch.equals("eu"))
        {
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        }
        else
        {
            System.out.println("Invalid Batch Type");
        }
         */

        String batch = "US";

        if (batch.equals("US") ||batch.equals("us"))
        {
            boolean isMorning=false;
            if (isMorning)
            {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }
            else
            {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }
        }
        else if (batch.equals("EU") || batch.equals("eu"))
        {
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        }
        else
        {
            System.out.println("Invalid Batch Type");
        }

    }
}
