package SaimExamples;

public class GradeRetake
{
    public static void main(String[] args)
    {
        // these are initally value because we need to use in if conditions
        int baseGrade=90;
        int numberOfAttempts=1;
        int retakePenalty=0;
/*


        if(numberOfAttempts ==1)
        {
           retakePenalty=(int)(baseGrade * 0.10);
           //the reason we cast because of 0.10 which is double so we have to do it
        }
        if (numberOfAttempts==2)
        {
            retakePenalty=(int)(baseGrade * 0.20);
        }
        if (numberOfAttempts==3)
        {
            retakePenalty=(int)(baseGrade * 0.30);
        }
 */
        if(numberOfAttempts ==1)
        {
            retakePenalty=(int)(baseGrade * 0.10);
            //the reason we cast because of 0.10 which is double so we have to do it
        }
        else if (numberOfAttempts==2)
        {
            retakePenalty=(int)(baseGrade * 0.20);
        }
        else if (numberOfAttempts==3)
        {
            retakePenalty=(int)(baseGrade * 0.30);
        }
        else
        {
            System.out.println("Invalid attempt");
        }

        System.out.println("Grade after retake attempt "+numberOfAttempts+" was: "+(baseGrade-retakePenalty));
    }
}

/*
    Write a program that will give the grade after the retake.
    The program should read a score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
    no decimal number so only whole number
 */