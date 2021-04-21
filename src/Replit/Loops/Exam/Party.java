package Replit.Loops.Exam;

import java.util.Scanner;

public class Party
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String list="Guest's list: ";
        String name="";
        String anotherGuest="";

        do {
            System.out.println("Please enter guest name:");
            name=input.next();
            list +=name+", ";
            System.out.println("Do you want to enter new guest name:");
            anotherGuest=input.next();
        }while (anotherGuest.equals("yes"));
        System.out.println(list.substring(0,list.length()-2));

    }
}
