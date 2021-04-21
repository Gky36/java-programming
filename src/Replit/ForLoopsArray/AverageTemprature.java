package Replit.ForLoopsArray;

import java.util.*;

public class AverageTemprature
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double average=0;
        double totalNum=0;

        for (double each:temps)
        {
            totalNum +=each;
        }
        average=totalNum/temps.length;
        System.out.println("average = " + average);
    }
}
