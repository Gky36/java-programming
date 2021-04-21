package day17_ternary_nested_conditions;

public class TernaryExample_01
{
    public static void main(String[] args)
    {
        int score=88;
        String result =(score>60)? "Pass":"Fail";
        System.out.println("result = " + result);

        String quality ="good";
        System.out.println(quality.equals("good")? 100:0);
        int rating=(quality.equals("good"))? 100:0;
        System.out.println("rating = " + rating);

        char grade= (score>90)? 'A':'B';

    }
}
/*
        All purpose of ternary make if statement just 1 line
        ADVANTAGES:
            => one statement to replace basis if else statement
            => if else is more flexible when you have multiple branch
 */