package day14_multi_branch_if_statements;

public class LogicalANDOperator_08
{
    public static void main(String[]args)
    {
        System.out.println(true&&true);// TRUE
        System.out.println(true&&false);// FALSE
        System.out.println(false&&true);// FALSE
        System.out.println(false&&false);// FALSE

        System.out.println(10>5 && 1==1);// true
        System.out.println(10>5 && 3<2); // false
        System.out.println(3<2 && 5>2);// false
        System.out.println(3<2 && 5<2);// false

        int apples=10;
        int oranges=5;
        boolean check= apples>5 && oranges>3;
        System.out.println("check = " + check);

        if(apples>6 && oranges>2)
        {
            System.out.println("I have enough applease and oranges");
        }
        else
        {
            System.out.println("I need to go to Walmart to buy some fruit");
        }
    }
}

/*
    &&, ||, !
        && =>      AND operator (ikisinin de ayni condition da olmasi gerekiyor TRUE= TRUE FALSE= FALSE)
        || =>       OR operator
        !  =>       NOT operator

    When you want to check 2 conditions at once, we can use and, or, operators
    to combine conditions in single statements
For ex:
    int apple=3;
    int oranges= 5;


        TRUE        TRUE
      (apples>2 && oranges>4)  iki conditions da dogru oldugu icin sonuc dogru

         False        TRUE
       (apples==1 && oranges<7) sonuc false cunku and oldugu icin ikisinde ayni olmasi lazim
                 FALSE

        TRUE        False
       apples<4 && oranges>10   result is false
               FALSE

         False          False
       apples>= 100 && oranges >20  result is false
                   FALSE
 */