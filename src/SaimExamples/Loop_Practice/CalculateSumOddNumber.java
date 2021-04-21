package SaimExamples.Loop_Practice;

public class CalculateSumOddNumber
{
    public static void main(String[] args)
    {
      int oddNumber=0;

      for (int i=1;i<100;i++)
      {
          if(i%2!=0)
          {
              System.out.print(i+" ");
              oddNumber +=i;
          }
      }
      //bos satir olarak asagiya gecmesini sagliyor ama \n ayni isimize yariyor.
        //System.out.println();
        System.out.println("\nOdd num Sum= "+oddNumber);
    }
}
