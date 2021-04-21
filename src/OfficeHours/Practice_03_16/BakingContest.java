package OfficeHours.Practice_03_16;

import java.util.Scanner;

public class BakingContest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int judge=1;
        System.out.println("Enter judge "+judge++ +"score");
        int scoreOne=input.nextInt();
        System.out.println("Enter judge "+judge++ +"score");
        int scoreTwo=input.nextInt();
        System.out.println("Enter judge "+judge++ +"score");
        int scoreThree=input.nextInt();

        System.out.println("Enter other person 1' score");
        int otherPerson1=input.nextInt();
        System.out.println("Enter other person 2' score");
        int otherPerson2=input.nextInt();

        // we have to get the average of 3 judges
        int ourAverageScore= (scoreOne+scoreTwo+scoreThree)/3;

        if (ourAverageScore > otherPerson1 && ourAverageScore>otherPerson2)
        {
            System.out.println("This is First Place");
        }
        else if ((ourAverageScore >otherPerson1 && ourAverageScore<2) || (ourAverageScore <otherPerson1 && ourAverageScore>2))
        {
            System.out.println("This is Second Place");
        }
        else
        {
            System.out.println("This is 3 Place");
        }
    }
}
