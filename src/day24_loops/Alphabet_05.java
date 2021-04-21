package day24_loops;

public class Alphabet_05
{
    public static void main(String[] args)
    {
      char letter='a';

      while (letter<='z')
      {
          System.out.print(letter+" ");
          letter++;
      }

        System.out.println();

      letter='z';
      while (letter>='a')
      {
          System.out.print(" " + letter);
          letter--;
      }
    }
}
/*
    DO WHILE LOOP

    Do while loop is similar to while loop. except the condition is checked at the bottom.

    FLOW IS
        1) Run the code the loop body
        2) Check the boolean condition
            -> if condition is true, go to step1
            ->if condition is false, exit the loop

     WHILE LOOP
        while loop checks the condition first, then if condition is true,
        it will run the loop body. Condition is checked at the beginning.
        If condition is false at the beginning, the loop body will not run at all.

    FLOW:
        1) Check boolean condition
            ->if condition is true  go to step 2
            ->if condition is false exit the loop
        2) Run/execute loop body, go to step1

     SO DO WHILE loop ensures that your code will run at least once

 */