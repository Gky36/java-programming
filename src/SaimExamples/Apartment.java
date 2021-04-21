package SaimExamples;

public class Apartment
{
    public static void main(String[]args)
    {
        String address="700 Rosewood Street";
        String nameOfTheOwner="Gokay";
        double numberOfUnit=25;
        int sizeOfEachUnit=900;
        double monthlyRentAmount = 2000.55;
        short numberOfWasherAndDryers= 8;
        String allowPetsOrNot ="YES";
        String hasApool="No";
        byte lengthOfLease=2;
        int totalNumberOfResidentsInBuilding=2001;
        long phoneNumberOfOwner= 9173208734L;
        boolean isNearAgasStation= true;
        byte numberOfFloors=8;
        boolean hasAbasement=true;
        boolean hasAvailableUnitForRent=true;
        String hasAirConditioning="Yes";
        double NumberOfParkingSpace=40;
        boolean hasWheelChairAccess= true;
        float numberOfReviewStars=4.9F;
/*
        double discountAfter3years=(monthlyRentAmount-(monthlyRentAmount*10/100));
        // Neden % isareti dogru calismiyor, soralim????
        System.out.println("Rent After 3 Years: $"+discountAfter3years);
        double discountAfter6years=(monthlyRentAmount-(monthlyRentAmount*20/100));
        System.out.println("Rent After 6 Years: $"+discountAfter6years);
*/
        double discount10= monthlyRentAmount *10/100;
        System.out.println("After 3Years:\t\t\t\t\t\t$"+(monthlyRentAmount-discount10));
        System.out.println("After 6 years:\t\t\t\t\t\t$"+(monthlyRentAmount-discount10*2));

        double numberOfResidentsPerUnit=totalNumberOfResidentsInBuilding/numberOfUnit;
        System.out.println("Number Of Residents Per Unit:\t\t"+numberOfResidentsPerUnit);

        double numberOfParkingSpotPer = NumberOfParkingSpace/numberOfUnit;
        System.out.println("Number of Parking Spots Per Unit:\t"+numberOfParkingSpotPer);

        double averageNumberOfUnitPerFloor =numberOfUnit/numberOfFloors;
        System.out.println("Average number of units per floor:\t"+averageNumberOfUnitPerFloor);

    }
}
