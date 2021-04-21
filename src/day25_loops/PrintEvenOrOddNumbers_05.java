package day25_loops;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class PrintEvenOrOddNumbers_05
{
    public static void main(String[] args)
    {
       int evenNum=0;
       int oddNum=0;
       int i=0;

       System.out.println("EVEN NUMBER:");
       for (i=1;i<=100;i++)
       {
           if (i%2==0)
           {
               System.out.print(i+" ");
               evenNum +=i;
           }
       }
        System.out.println("\nEven Number Sum= "+evenNum);

        System.out.println("ODD NUMBER");
        for (i=1;i<=100;i++)
        {
            if (i %2 !=0)
            {
                System.out.print(i+" ");
                oddNum +=i;
            }
        }
        System.out.println("\nOdd Number Sum= "+oddNum);

    }
}
