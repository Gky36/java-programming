package Replit.Loops.Exam;
import java.util.Scanner;

public class PrintLetters
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        if (start<end) {
            for (int i = start; i <= end; i++) {
                System.out.print(start++);
            }
        }
        else
        {
            for (int i=end; i<=start; i++)
            {
                System.out.print(end++);
            }
        }
    }
}
