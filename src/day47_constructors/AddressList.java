package day47_constructors;

public class AddressList
{
    public static void main(String[] args)
    {
      Address cyberTekAddress = new Address();
      cyberTekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
      cyberTekAddress.setCity("McLean");
      cyberTekAddress.setState("VA");
      cyberTekAddress.setZipcode("22182");

      System.out.println("CybertekSchool Address"+cyberTekAddress.toString());

       cyberTekAddress.setStreet("7925 Jones Branch Dr Suite 3200");
       System.out.println("address after update = "+cyberTekAddress.toString());
       System.out.println("street info "+cyberTekAddress.getStreet());
       System.out.println();

       Address newAddress = new Address();
       newAddress.setStreet("7921 Jones Branch Dr Suite 200");
       newAddress.setCity("McLean");
       newAddress.setState("VA");
       newAddress.setZipcode("22102");
       System.out.println(newAddress.toString());

       Address papaJon = new Address("8501 Tyco Rd Ste 1A","Vienna","VA","22182");
        System.out.println(papaJon.toString());
    }
}
