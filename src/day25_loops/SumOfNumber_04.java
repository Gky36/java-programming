package day25_loops;

public class SumOfNumber_04
{
    public static void main(String[] args)
    {
        int sum=0;
        for (int i=1; i<=5;i++)
        {
            // the reason that i do i need to sub to number.
            sum +=i;
        }
        System.out.println("sum = " + sum);
    }
}
