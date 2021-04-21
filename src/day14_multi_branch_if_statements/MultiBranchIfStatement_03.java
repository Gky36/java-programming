package day14_multi_branch_if_statements;

public class MultiBranchIfStatement_03
{
    public static void main(String[]args)
    {
        int day=1;
        if(day==1)
        {
            System.out.println("Monday");
        }
        else if(day==2)
        {
            System.out.println("Tuesday");
        }
        else if (day==3)
        {
            System.out.println("Wendesday");
        }
        else if (day==4)
        {
            System.out.println("Thursay");
        }
        else
        {
            System.out.println("Java Day");
        }

    }
}
/*
    can not use if conditions single condition.

    when we use multi branch if statement, we combine multiple related conditions into one
    java checks each condition from top to bottom, once it finds true condition, it will run the code
    for that if, and exits. it does not check other condition below.

    Optionally we can included else block at the very end, and it only work

    Once it finds first true condition, it will not check the other condition even if they are true
 */