package day24_loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame_08
{
    public static void main(String[] args)
    {

      /*
        Scanner input= new Scanner(System.in);
        int guessingNumber=0;
        int secretNumber=100;

        do {
            System.out.println("Enter a guessing number");
            guessingNumber=input.nextInt();

            if (guessingNumber>secretNumber)
            {
                System.out.println("Wrong, your number is too large");
            }
            else if (guessingNumber<secretNumber)
            {
                System.out.println("Wrong, your number is too small");
            }
        }while (secretNumber!=guessingNumber);
        System.out.println("Congratulations, you won! secret number:"+secretNumber);

       */

        Random randomNum= new Random();
        Scanner input= new Scanner(System.in);

        int secretNumber= randomNum.nextInt(101);
        int guessingNumber=0;

        do {
                System.out.println("Enter a guessing number");
                guessingNumber=input.nextInt();
            if (guessingNumber>secretNumber)
            {
                System.out.println("Wrong, your number is too large");
            }
            else if (guessingNumber<secretNumber)
            {
                System.out.println("Wrong, your number is too small");
            }
        }while (secretNumber!=guessingNumber);
        System.out.println("Congratulations, you won! secret number: "+secretNumber);

    }


}
