package Replit.StringManipulation;

import java.util.*;

public class Alejandro
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if (a.contains("Alejandro")&&a.contains("project"))
        {
            System.out.println("read");
        }
        else
        {
            System.out.println("don't read");
        }
    }
}
