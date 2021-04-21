package day28_loops;

public class BreakVsContinue_04
{

    public static void main(String[] args)
    {
        //BREAK statement
        for (int i =1; i<=5;i++)
        {
            System.out.println(i);
            if (i==3 )
            {
                break;
            }
        }
        System.out.println();
        for (int i=1;i<=5;i++)
        {
            if (i==2 ||i==4)
            {
                System.out.println(i);
                continue;//go to next iteration. skip the code below
            }
        }
    }
}
/*
Continue = statement will cause the loop iteration to stop go to next iteration.
 */