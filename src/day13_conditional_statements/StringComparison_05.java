package day13_conditional_statements;

public class StringComparison_05
{
    public static void main(String[]args)
    {
        String city ="New York";
        if(city.equals("New York"))
        {
            System.out.println("It is New York");
        }
        else
        {
            System.out.println("It is not NYC");
        }

        String weather="sunny";
        if(weather.equals("sunny"))
        {
            System.out.println("Take fresh air");
        }
        else
        {
            System.out.println("Stay home and coding java");
        }
    }
}

/*
    We can check if String value equals some other value
    there are 2 ways we can compare
        1) Using == operator
           String city= "Fairfax";
           if(city =="Fairfax")
        2) using equals() method/function   (MORE RELIABLE WAY)
            String city= "Los Angeles";
            if(city.equals("Los Angeles"))
                {
                    print....
                }
 */
