package SaimExamples.Loop_Practice;

public class OddNumberDivisible
{
    public static void main(String[] args)
    {

        System.out.println("ODD number divisible by 3&5 :");

       for (int i=0;i<100;i++)
       {
           if (i%2!=0)
           if (i %3==0 && i %5==0)
           {
               System.out.print(i+" ");

           }
       }

        System.out.println("\nEVEN number divisible by 3&5: ");

       for (int i=0;i<100;i++)
       {
           if (i %2==0)
           {
               if (i %3==0 && i %5==0)
               {
                   System.out.print(i+" ");
               }
           }
       }
    }
}
