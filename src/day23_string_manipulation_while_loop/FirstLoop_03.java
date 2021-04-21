package day23_string_manipulation_while_loop;

public class FirstLoop_03
{
    public static void main(String[] args)
    {

        int i=1;

        while (i<=5)
        {
            System.out.println(i);
            i++;
        }

        int apples=0;

        while(apples<=3)
        {
            System.out.println("apples = " + apples);// we can add apples++; it is same think
            apples++;
        }
        System.out.println("apples = " + apples);

        
    }
}
/*
    WHILE LOOP

    similar to if statement, it checks if the condition is tru, and runs the while loop block code
    And it will keep running the code as long as condition stays true.

    LOOPS IN PROGRAMING are used to repeat same block of code multiple times, as long as condition is true.
    They are very useful for repetitive actions.

    INFINITE LOOP => loop that does not stop, because boolean condition is always true.
    it keeps running code in loop block

 */