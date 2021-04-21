package SaimExamples.SwitchExampl;

public class HouseOccupants
{
    public static void main(String[]args)
    {
        String houseType="Mobile Home";

        switch (houseType)
        {
            case "Tree House":
                System.out.println("Tree House");
                break;
            case "Mobile Home":
            System.out.println("Mobile home: 2");
            break;
            case "Apartment":
                System.out.println("Apartment: 4");
                break;
            case "Town House":
                System.out.println("Town house: 6");
                break;
            case "Villa":
                System.out.println("Villa: 8");
                break;
            case "Mansion":
                System.out.println("Mansion: 10");
                break;
            default:

        }
    }
}
