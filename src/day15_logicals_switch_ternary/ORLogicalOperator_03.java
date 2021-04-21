package day15_logicals_switch_ternary;

public class ORLogicalOperator_03 {
    public static void main(String[] args) {

        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 7;

        System.out.println(apples > 3 || oranges > 4); //true
        if (apples > 3 || oranges > 4)
        {
            System.out.println("No need to buy any fruits today");
        }
        else
            {
            System.out.println("Need to get some fruits");
            }
        System.out.println(apples > 2 || oranges > 10);
        if (apples > 2 || oranges > 10)
        {
            System.out.println("Looks like we are good with fruit");
        }
        else
            {
                System.out.println("Need to get some fruits");
            }
        System.out.println(apples==0 || oranges==0);
        if (apples == 0 || oranges == 0)
        {
            System.out.println("Need to purchase some fruit");
        }
        else
        {
            System.out.println("We are good with fruits");
        }
    }
}

/*
       OR || LOGICAL OPERATOR.
       OR || checks 2 conditions and returns TRUE both or ONE of the conditions are TRUE.

       TRUTH TABLE FOR OR ||

       true + ture  == true
       true + false == true
       false+ true  == true
       false+ false == false

   For Exam:
   int apples=5;
   int oranges=10;

        TRUE    OR    FALSE                 TRUE        FALSE
       apples>1 || oranges<20             apples>1  || oranges== 20
               TRUE                                 TRUE


                                                    FALSE           FALSE
            FALSE          TRUE                  apples !=5 || oranges !=10
       apples>10 ||  oranges==10                            FALSE
               TRUE
 */