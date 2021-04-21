package day15_logicals_switch_ternary;

public class CitySelector_04
{
    public static void main(String[]args)
    {
        String city="Moscow";

        if(city.equals("Moscow") ||city.equals("Tampa"))
        {
            System.out.println("Willing to relocate to Moscow");
        }
        else
        {
            System.out.println("Not considering -"+city);
        }

        String teacher="Saim";

        if(teacher.equals("Saim") ||teacher.equals("Murodil"))
        {
            System.out.println("It is a java class with "+teacher);
        }
        else
        {
            System.out.println("Soft skill class with"+teacher);
        }

        if (teacher.equals("Saim") || teacher.equals("Murodil"))
        {
            System.out.println("It is a java class");
        }
        else if (teacher.equals("Nadir"))
        {
            System.out.println("Soft skill with"+teacher);
        }
        else {
            System.out.println("Some other class with " + teacher);
        }


        //company - "Google" OR salary>=100k accept to offer

        String company="Google";
        double salary=100_000;
        if(company.equals("Google") ||salary>=100_000)
        {
            System.out.println("I accepted to offer");
        }
        else
        {
            System.out.println("Thank you I keep looking");
        }
    }
}
