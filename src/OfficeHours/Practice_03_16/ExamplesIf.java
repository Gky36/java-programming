package OfficeHours.Practice_03_16;

public class ExamplesIf
{
    public static void main(String[] args)
    {
      int a= 10;  // a =9
      int b = a-- *2 - --a % 2+ a;
      //      10  *2 -  8  % 2+ 8
        //    20    -   8% 2+8
        //    20    -    0  +8
        //    28
        System.out.println(b);
    }
}
/*
 2 % 7 = 2  always small number if reminder smaller than the other
 7 % 2 =1
 */

