package day16_switch_ternary;

public class TernaryIntro_04
{
    public static void main(String[] args) {

        int score=90;
        String result = (score>=60)? "PASS" : "FAIL";
        System.out.println("result= PASS");

    }
}

/*
 TERNARY OPERATOR:

        ? => this operator can be used for simple if else conditions.
      FOR EX:

      String result;
      int score= 90;
                                                                IF TRUE     TRUE   ELSE
      if(score>60)                              String result= (score>60)? "PASS"   :    "FAIL";
      {
        result="pass"
      }
      else
       {
        result="fail";
       }
 */