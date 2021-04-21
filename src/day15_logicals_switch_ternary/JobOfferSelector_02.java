package day15_logicals_switch_ternary;

public class JobOfferSelector_02
{
    public static void main(String[] args)
    {
        String location="New York";
        double salary=150000;
        boolean isRemote=true;
        boolean hasBenefits=true;

        if(hasBenefits && isRemote && location.equals("New York") && salary==150000)
        {
            System.out.println("Offer accepted");
        }
        else
        {
            System.out.println("Keep looking for a job");
        }
    }
}

