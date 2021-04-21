package day15_logicals_switch_ternary;

public class NotLogicalOperator_07
{
    public static void main(String[] args)
    {
        System.out.println("!true = "+(!true));
        System.out.println("!false = "+(!false));

        int age= 2;
        if(!(age>7))
        {
            System.out.println("Need to sit in child car seat" +age);
        }
        else
        {
            System.out.println("Can sit normal sit"+age);
        }

        boolean isSmokingAllowed =false;
        if (!(isSmokingAllowed))
        {
            System.out.println("Smoking is not allowed here");
        }

        boolean isAffordable=true;
        if(!isAffordable)
        {
            System.out.println("Item is not Affordable");
        }
        String env="QA";
        if(!env.equals("QA"))
        {
            System.out.println("In wrong environment for QA ");
        }
        String carModel="Tesla";
        if (!(carModel.equals("Tesla")))
        {
            System.out.println("I am not interested");
        }

        String secretPassword="abc123";
        String inputPassword= "abc321";

        if (!(inputPassword.equals(secretPassword)))
        {
            System.out.println("Incorrect password");
        }
    }
}
/*
    FOR BOOLEAN OPERATORS
       &&==> is evaluated first, then ==>  || is evaluated
        if we use paranthesis, then

    ! NOT OPERATOR
    It takes boolean value(true or false) and reserves it

    !true   => false
    !false  => true
    int apples =5;

    !(apples >2) ==> false as condition itself it true, but ! operator
    !(apples<3) ==>  true as condition itself it false, but ! operator change it.
 */

/*
    LOGICAL OPERATORS:
    &&,  ||,    !

    && => returns true when both conditions are true
    || => returns true when one or both conditions are true
    !  => reverses !true to false, and !false to true

    we can use them in combination, it is better to use parenthesis to get correct to result.

    we can use any of operators multiple times in same statements

    &&  =>&
    ||  =>|

    there is slight difference between double &&(short circuit) and &

    int apples =5;
    int oranges= 10;

        TRUE        TRUE                                       TRUE        FALSE
    apples ==5 && oranges ==10                             apples >1 && oranges ==11
             TRUE                                                   FALSE

        False       NOT CHECKED                                 false           true
    apples ==15 && oranges ==10                            apples==15   &   oranges==10
               FALSE

   when we use &&(short circuit), it is more efficient, if java already knows the END result
   just by evaluation/checking the FIRST conditions, then it will SKIP checking the next conditions

   when we use & (and) , it will check/evaluate BOTH conditions no matter what

   ||(short circuit) is more efficient compared to |(single)

   WHEN we use || OR operator, if end result is clear after check both condition,
   then second condition will be skipped, not checl


 When we use | OR both are checked, no matter what
    TRUE  SKIPPED                       TRUE FALSE
   5>4 || 3<2                         5>4  | 3<2
       TRUE                               TRUE

  We always use ||, && to make our code little bit more efficient for processing.
  So the difference is && is more efficient for execution compare to single and AVOID using single ones
  So the difference is || is more efficient for execution compare to single and AVOID using single ones

 */