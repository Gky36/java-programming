package Replit.Methods;

import java.util.Scanner;

public class SimpleRoomBooking
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year)
    {


       if (isAvailable==true && year==2018)
       {
           if (day>=1 && day<=8 && month==7)
           {
               return false;
           }
           else
           {
               return true;
           }
       }
       else
       {
           return false;
       }

    }
}


/*
To book a room first it needs to be available for rent and make sure its available at the date selected:

the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018
 */