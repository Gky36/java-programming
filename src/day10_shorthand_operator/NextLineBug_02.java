package day10_shorthand_operator;

import java.util.Scanner;

public class NextLineBug_02
{
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter rent and month");
        double rent=scan.nextDouble();
        //scan.nextLine(); // fix the bug. Work-around
        String month=scan.nextLine();
        //System.out.println("Rent = "+rent);
        //System.out.println("month = " + month);
        System.out.println("Rent = "+rent+" month "+month);
    }
}
// Whenever we use NextLine, nextDouble,
// Please add additional scan.nextLine() right before