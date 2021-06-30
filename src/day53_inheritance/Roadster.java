package day53_inheritance;

public class Roadster extends ElectricCar
{
    //Roadster r = new Roadster("Roadster",20000,2022,620)
    public Roadster(String make, String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
        System.out.println("Welcome ");
    }
}
