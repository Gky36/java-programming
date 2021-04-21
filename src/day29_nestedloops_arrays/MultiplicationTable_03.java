package day29_nestedloops_arrays;

public class MultiplicationTable_03
{
    public static void main(String[] args)
    {
      for (int outer=1;outer<=10;outer++)
      {
          for (int inner=1;inner<=10;inner++)
          {
              int result=outer*inner;
              System.out.print(result+"\t");
          }
          System.out.println();
      }
    }
}
/*
When we use nested for loop, we can use the variable of outer loop inside the inner loop

Or inner loop, can loop until the value of outer loop iterator.
We use nested loops, when reading data fro, excel files, multi-d arrays,
where there s ROW and COLUMN.
 */

