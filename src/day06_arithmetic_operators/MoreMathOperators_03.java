package day06_arithmetic_operators;

public class MoreMathOperators_03
{
    public static void main(String[] args)
    {

        int toyotas= 431;
        int hondas= 233;
        int vws=2;
        int teslas=20;
        int nissans= 1;
        int bmws= 155;
        int totalCarsInParking= toyotas+hondas+vws+teslas+nissans+bmws;

        //int toyotas=431, hondas= 233, vws =2, teslas=20, nissans=1, bmws=155;
        //int totalCarsInParking = toyotas+hondas+vws+teslas+nissans+bmws;

        System.out.println("There are "+totalCarsInParking+ " in the parking lot" );

        String pizza="hawaiian";
        int slice=8;
        int people=4;
        int slicePerPerson= slice/people;
        System.out.println("There are "+slicePerPerson+" slice per person");
        System.out.println("We ordered "+ pizza+" pizza with "+slice+" slices, "+people+" people ate "+slicePerPerson+" slices each.");



    }
}
