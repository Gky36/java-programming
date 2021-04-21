package Replit.Loops.Exam;
import java.util.Scanner;


public class CountHi
{
    public static void main(String[] args)
    {
        //COUNT HOW MANY HI IN SENTENCE

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count=0;

//        while (str.contains("hi"))
//        {
//            count++;
//            // replace First kullanmamizdaki amac ilk bulup sonraki ni bulmamiza yardimci oluyor
//            str=str.replaceFirst("hi","");
//        }
//        System.out.println(count);

        for (int i=0; i<str.length()-1;i++)
        {
            String twoLetter=str.substring(i,i+2);

            if (twoLetter.equals("hi"))
            {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
