package SaimExamples;

import java.util.Scanner;

public class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter income amount: ");
        double incometax=scan.nextDouble();

        if (incometax>15001 && incometax<30000)
        {
            incometax=(incometax*5/100);
            System.out.println("incometax = " + incometax);
        }
        else if (incometax>=30000)
        {
            incometax=(incometax*10/100);
            System.out.println("incometax = " + incometax);
        }
        else
        {
            System.out.println("No tax is paid on the first $15,000 of net income");
        }
    }
}

