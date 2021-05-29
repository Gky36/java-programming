package day46_encapsulation;

public class Dealership
{
    public static void main(String[] args)
    {
        Car car1 = new Car();

        car1.setModel("Mercedes");
        System.out.println("Car Model = "+car1.getModel());

        car1.setYear(2021);
        System.out.println("Car Year = "+car1.getYear());

        car1.setMileage(34);
        System.out.println("Car Mileage = "+car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1); //automatically calls toString method

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2020);
        alfaRomeo.setMileage(23);

        System.out.println("Model = " +alfaRomeo.getModel());
        System.out.println("Year = " +alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        // it will give all information same sentence
        System.out.println(alfaRomeo.toString());




    }
}
/*

OOP: Object Oriented Programming
-Encapsulation

-Polymorphism:
       -> Many forms. We can have parent reference type and any child object type.

- Constructor:
        -> Special method that is called when object is created for a class. it has same name as classname and no return type.
        -> it helps with initialization of instance variables.

 */