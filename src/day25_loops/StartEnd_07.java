package day25_loops;

import java.util.*;

public class StartEnd_07
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter start Number: ");
        int start=input.nextInt();
        System.out.println("Enter end number: ");
        int end= input.nextInt();

        if (start>end)
        {
            System.out.print("reverse numbering is not supported");
        }

        for (int i=start;i<=end;i++)
        {
            System.out.println(i+" ");
        }
    }
}
