package day25_loops;

public class ForLoopFirst_02
{
    public static void main(String[] args)
    {
        for (int i=0; i<=5; i++)
        {
            System.out.println("Hello world!");
        }

        // for loop: 1-10. print to number
        //   1)       2)    4)
        for (int i=1;i<=10;i++)
        {
            System.out.print(i+" "); //3)
        }
    }
}

/*
            below is infinite loop with for loop like: while(true){ }
      for (; ;)
      {
          System.out.println("Java if fun");
      }

         */
