package Replit.Methods;

import java.util.Scanner;

public class FindCube
{
    public static void main(String[] args)
    {
      cube();
    }

    public static void cube()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("input: ");
        int input=scan.nextInt();
        int output=input*input*input;
        System.out.println("output: "+output);
    }
}
