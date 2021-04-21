package SaimExamples.Loop_Practice;

public class CalculateSumEvenNumber
{
    public static void main(String[] args)
    {
      int evenNumber=0;

      for (int i=1; i<100;i++)
      {
          if (i %2==0)
          {
              System.out.print(i+" ");
              evenNumber +=i;
          }
      }

        System.out.println("\nEvenNumber Sum = " + evenNumber);
    }
}
