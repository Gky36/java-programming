package OfficeHours.Practice_03_22;

public class Operator
{
    public static void main(String[]args)
    {
        int a=3;
        int b=2;
        long c= (a-- + b)*2/3%2;
        System.out.println(c);

        int number1= 10;
        int number2= number1++ * 3 + ++number1 + number1++ % 2;
                      // 10    * 3 +    11     + 11        % 2;
                      //    30       +    11     + 1
                      // 42
        System.out.println(number2);
        int biggest= (number1>number2)? number1:number2;
        //            10     >  42
        // false
        System.out.println(biggest);
    }
}


