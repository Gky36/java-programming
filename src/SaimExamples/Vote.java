package SaimExamples;

public class Vote
{
    public static void main(String[] args)
    {
       String citizenship="USA";

       if (citizenship.equals("USA") || citizenship.equals("usa"))
       {
           System.out.println("USA citizen:");
           int age=18;
           if (age<=18)
           {
               System.out.println("You are eligible to vote");
           }
           else
           {
               System.out.println("You must be at least 18 years old to vote");
           }
       }
       else
       {
           System.out.println("You must be US citizen in order to vote");
       }
    }
}
