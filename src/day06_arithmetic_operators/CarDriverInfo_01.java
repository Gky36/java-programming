package day06_arithmetic_operators;

public class CarDriverInfo_01
{
    public static void main(String[] args)
    {
        String carModel= "Mercedes";
        String driverName= "Batman";
        String licenseNum="BTM123";
        short speed =110;
        boolean isAutomatic= true;
        char licenseClass='D';

        System.out.println("Car Model:\t\t"+carModel);
        System.out.println("Driver Name:\t"+driverName);
        System.out.println("License Number:\t"+licenseNum);
        System.out.println("Speed:\t\t\t"+speed);
        System.out.println("Is Automatic:\t"+isAutomatic);
        System.out.println("License Class:\t"+licenseClass);
        System.out.println(driverName+" is driving "+carModel);
        System.out.println("Current speed is: "+speed);
        //Current speed is:55 mph
        System.out.println("Current speed is: "+ speed+" mph");
        System.out.println(licenseClass+" - "+isAutomatic);
        // Char ile boolean ekledigimize ortaya string yapmamiz gerekiyor.

        //System.out.println("Car:\t\t\t"+carModel+"\nDriverName:\t\t"+driverName+"\nLicenseNumber:\t"+licenseNum+"\nSpeed:\t\t\t"+speed+"\nAutomactic:\t\t"+isAutomatic+"\nLicense Class:\t"+licenseClass+"\n"+driverName+" is driving "+carModel);
    }
}
