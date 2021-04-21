package day04_variables_intro;

public class VariableNamingRules
{
    public static void main(String[] args)
    {
        //int static = 22; -> error, static is reserved so we can not use it
        int static2 =22;
        int _static =22;
        int $tatic =44;
        int staticVar =43;

        int salary$= 55;
       // int 1stMonthSalary = 390; ->ERROR: We can't start with number
        int $ = 10;
        // int _ = 3; not encouraged to use it.
        // Above variables work fine, but not recommended.
        // We should use meaningful variable names
        // int number-of-friends = 400;

    }
}
