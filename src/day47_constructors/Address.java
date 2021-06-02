package day47_constructors;

public class Address
{
   private String street;
   private String city;
   private String state;
   private String zipcode;
   private String country = "USA";

   //constructor method- automatically called
    // main purpose we can automatically initialize
   public Address()
   {
       System.out.println("Address constructor");
       street = "123 unknown st";
       city = "Unknown";
       state = "Unknown";
       zipcode = "00000";
   }
// second constructor, overloaded constructor -> provides shortcut to initialize variables
    // in the same statement
   public Address(String street, String city, String state, String zipcode)
   {
       //2 way to asssign street and benefit of using setStreet we can use condition inside as we did in method
       //setStreet(street);
       this.street = street;
       this.city = city;
       this.state =state;
       this.zipcode = zipcode;

   }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
       if (street.isEmpty() || street.length() >50)
       {
           System.out.println("Error : invalid street");
       }
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return street+", "+city+", "+state+", "+zipcode;
    }
}
/*
Constructor in JAVA:
    -> It is a special method that is called automatically when the object of the
    class is created using new keyword.
    -> It does not have return type
    -> It must be name as class Name
    -> It is used to initialize the instance variables.

We need the setter methods to update the variable values, because constructor runs once in the beginning.
 */