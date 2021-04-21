package day26_loops;

public class MultiplicationTable_01
{
    public static void main(String[] args)
    {
        // if we assign variable more than 10 or less than 1, it will give error
        int i=1;
        int n=1;

        if (i<1 || i>10 && n<1 ||n>10)
        {
            System.out.println("ERROR: invalid input");
            return;
        }

        for( i = 1; i <=10; i++)
        {
        for ( n = 1; n <= 10; n++)
        {
            int result=i*n;
            System.out.print(i+" x "+ n + " = "+ result + "\t\t");
        }
        System.out.println();
         }
    }
}
/*
    if number less than 1 or more than 10
    print "error: invalid input"
    exit main method: retrun;
 */