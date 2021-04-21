package SaimExamples;

import java.util.Scanner;

public class Rectangle
{
    public static void main(String[]args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the length: ");
        double length=scan.nextDouble();
        System.out.println("Enter the width: ");
        double width=scan.nextDouble();
        double perimeter= 2*(length*width);
        double area=width*length;
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Area = " + area);
    }
}

/*
    Declare two variables: length and width
        - Calculate the Perimeter 2(l*w)
        - Calculate the Area (w * l)
        - Print properties of the Rectangle
        - Modify to accept Scanner inputs
 */