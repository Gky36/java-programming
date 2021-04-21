package day39_wrapper_classes;

public class ParseString
{
    public static void main(String[] args)
    {
        String total="345";
        int count= Integer.parseInt(total);
        System.out.println("count = " + count);

        String total1="45.62";
        double count1= Double.parseDouble(total1);
        System.out.println("total = " + total);

        String total2="6543F";
        float count2=Float.parseFloat(total2);
        System.out.println("count2 = " + count2);

        String strPrize="123.5";
        double price=Double.parseDouble(strPrize);
        if (price>100)
        {
            System.out.println("expensive ");
        }

        String sentence="I wrote 100 lines of code";
        //split by space, parse index 2 to int
        String [] str=sentence.split(" ");
        int linesOfCode= Integer.parseInt(str[2]);
        System.out.println("lines of Code = "+linesOfCode);

    }
}
/*
SUMMARY:
    wrapper classes
    primitive type object
    useful method with wrapper classes
    converting String into int/double
 */