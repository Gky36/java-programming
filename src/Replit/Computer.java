package Replit;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Computer
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        double totalPrice=0;

        System.out.println("Select screen size:");
        double screenSize=scan.nextDouble();

        if(screenSize ==13.3)
        {
            totalPrice+=200;
        }
        else if(screenSize==15.0)
        {
            totalPrice=300;
        }
        else if(screenSize==17.3)
        {
            totalPrice=400;
        }

        // totalPrice=200
        System.out.println("Select CPU type");

        String CPU= scan.next();
        if (CPU.equals("i3"))
        {
            totalPrice +=150;
        }
        if (CPU.equals("i5"))
        {
            totalPrice +=250;
        }
        if (CPU.equals("i7"))
        {
            totalPrice +=350;
        }
        // totalPrice= 450
        System.out.println("Select RAM size:");
        int RAM=scan.nextInt();
        totalPrice=totalPrice+ (RAM/4)*50;

        System.out.println("Select storage type:");
        String storage=scan.next();

        System.out.println("Enter memory size");
        int memorySize= scan.nextInt();
        if (storage.equals("HDD"))
        {
            totalPrice=totalPrice+(memorySize/500)*50;
        }
        if (storage.equals("SSD"))
        {
            totalPrice=totalPrice+(memorySize/500)*100;
        }
        System.out.println("Enter screen resolution:");
        String resolution=scan.next();
        if(resolution.equals("FULLHD"))
        {
            totalPrice +=100;
        }
        if (resolution.equals("4K"))
        {
            totalPrice +=200;
        }
        System.out.println("Laptop price is: "+"$"+totalPrice);

    }
}
