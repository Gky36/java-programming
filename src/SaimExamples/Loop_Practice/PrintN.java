package SaimExamples.Loop_Practice;
import java.util.Scanner;

public class PrintN
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i=0;

        while (n>i)
        {
            System.out.print("*");
        }


    }
}
