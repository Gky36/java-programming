package day12_conditioanl_statements;

public class IFElseStatement_02
{
    public static void main(String[]args)
    {

        if(10>5)
        {
            System.out.println("Condition is true");
        }
        else
            {
                System.out.println("Condition is false");
            }

        int count=25;
        // check if count is more than 30, if yes
        if(count>30)
        {
            System.out.println("Count is more than 30");
        }
        else
            {
                System.out.println("Count is less than 30");
            }
        byte age=25;
        if(age>=18)
        {
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }
        else
            {
                System.out.println("Not Eligible to vote");
                System.out.println("Age is less than 18");
            }
    }
}
