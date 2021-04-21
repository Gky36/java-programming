package day15_logicals_switch_ternary;

public class UsedCarSelector_06
{
    public static void main(String[] args)
    {
        double budget = 5000.0;
        String model = "Toyota";
        double carPrice = 4000;

        // Once first condition kullandik daha sonra da diger condition kullanildi.

        if(carPrice <= budget && (model.equals("Toyota")) ||(model.equals("Honda")) || (model.equals("Tesla")))
        {
            System.out.println("Ready to purchase model= " +model+", price "+carPrice);
        }
        else
        {
            System.out.println("Not interested in model= " +model+", price "+carPrice);

        }
    }
}


