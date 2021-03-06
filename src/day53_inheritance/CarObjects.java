package day53_inheritance;

public class CarObjects
{
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        //System.out.println(ec1.make); ERROR make is private
        //System.out.println(ElectricCar.make); ERROR . make needs to be public static
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());

        if (ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() +" - "+ec1.getModel() +" is out of my budget");
        } else
        {
            System.out.println("purchasing " + ec1.toString());
        }

        ElectricCar ec2 = new ElectricCar("Tesla","CyberTruck",89000,2022,300);
        System.out.println(ec2.toString());
        System.out.println("Count = "+ec2.getCount()); //call static method using object
        System.out.println("Count = "+ ElectricCar.getCount()); // call static method using class name

        Roadster roadster = new Roadster("Roadster", "20000", 2022,2021,23);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.toString());

        ModelX myModelX = new ModelX("Tesla","Model X",89999,2021,390);
        System.out.println(myModelX.toString());
        myModelX.drive(10);
        System.out.println("Having luch...");
        myModelX.drive(10);
        System.out.println("myModelX.getRange() = " + myModelX.getRange());
        System.out.println("ElectricCar.getCount() = " + ElectricCar.getCount());


    }
}

