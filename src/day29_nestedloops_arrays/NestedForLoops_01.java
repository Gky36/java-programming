package day29_nestedloops_arrays;

public class NestedForLoops_01
{
    public static void main(String[] args)
    {
        // DIGITAL CLOCK
        for (int minutes = 0; minutes < 60; minutes++)
        {
            System.out.println(minutes + " Minutes:");
            for (int second = 1; second < 60; second++)
            {
                    System.out.print(second + "");
            }
            System.out.println();
        }

        // 3 HOURS 4 MINUTES AND 60 SECOND
        for (int hour=0;hour<=3;hour++)
        {
            for (int minutes = 0; minutes <= 4; minutes++)
            {
                for (int seconds = 0; seconds < 60; seconds++)
                {
                    System.out.println(hour+": "+minutes + ": " + seconds);
                }
            }
        }
    }
    }
/*
NESTED LOOP IN JAVA:
        ==>We can write nested loops in java, using while, do while, for loops.

        ==>How does it work:
            For each single iteration of OUTER LOOP, INNER LOOP completes
            full cycle each time.
            OUTER LOOP equals 1, before outer loop goes ++, increase, the inner loop
            needs to complete FULL CYCLE (1 to 5)


Icerde ki loop her zman full cyle tamamlar ve daha sonra ki disardaki loop gecer
Her zman bu sekilde gerceklesir.
 */