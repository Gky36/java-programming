package day29_nestedloops_arrays;

public class StarsNestedLoop_02
{
    public static void main(String[] args)
    {
      for (int outer=1;outer<=5;outer++)
      {
          for (int inner=1;inner<=10;inner++)
          {
              System.out.print("*"+" ");
          }
          System.out.println();
      }
        System.out.println();

      for (int outer=1;outer<=10;outer++)
      {
          int space=10-outer;
          for (int n=1;n<=space;n++)
          {
              System.out.print(" ");
          }
          for (int inner=1;inner<=outer;inner++)
          {
              System.out.print("* ");
          }
          System.out.println();
      }


        for (int outer=1;outer<=10;outer++)
        {
            int space=outer;
            for (int i=1;i<space;i++)
            {
                System.out.print(" ");
            }
            for (int inner=10;inner>=outer;inner--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
