package day36_methods_with_return;

public class CreditScore_01
{
    public static void main(String[] args)
    {
      checkEligible(720);
      checkEligible(500);
      System.out.println("CreditScore = "+getCreditScore());
      int score=getCreditScore();
      System.out.println("score = "+score);
    }
    public static void checkEligible(int creditScore)
    {

        if (creditScore>=700)
        {
            System.out.println("Your are eligible for leasing this car");
        }
        else
        {
            System.out.println("Sorry, you are not eligible leasing this car");
        }
    }

    public static int getCreditScore()
    {
        return 800;
    }
}
