package day05_primitives_concatenation;

public class CellPhone
{
    public static void main(String[] args)
    {
        String brand="Apple ";
        String color="Silver";
        String model="Iphone12";
        double price =1000.23;
        int storage =256;
        boolean hasCamera = true;
        /*
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(hasCamera);
        */
        System.out.println("Brand is "+brand);
        System.out.println("Model is "+model);
        System.out.println("Color is "+color);
        System.out.println("Price is $"+price);
        System.out.println("Storage is "+storage+"GB");
        System.out.println("Has Camera? "+hasCamera);
    }
}
/* String is a non primitive, object type, and the most popular data type in the world.
        Any value within double quotes becomes a String
        "hello" ->String value, it is letters and with double quotes
        "123" -> Also string, because we added double quotes.
         125  -> not a string , its a whole number
*/