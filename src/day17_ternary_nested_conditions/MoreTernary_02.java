package day17_ternary_nested_conditions;

public class MoreTernary_02
{
    public static void main(String[]args)
    {
        int hourlyRate=50;
        String reply= (hourlyRate>=50)? "Accepted":"Rejected";
        System.out.println("reply = " + reply);

        String todayClass="java";
        String teacher=(todayClass.equals("java"))? "Murodil":"Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive=true;
        String driving=(isEligibleToDrive=true)? "have DL, Can drive":"No DL, can not drive";
        System.out.println("isEligibleToDrive = " + isEligibleToDrive);
    }
}
/*
    NESTED IF STATEMENT

    We can put IF statement inside IF statement. that is called

    if(condition)
    {
    if(condition2)
    }
    else
    {
    if(condition3)
    }

    1) condition1, condition2 are true: code A

 */