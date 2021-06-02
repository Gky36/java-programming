package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects
{
    public static void main(String[] args)
    {
       Customer cs1 =new Customer();
       System.out.println(cs1.toString());
        cs1.setName("Bob");
        cs1.setId(1);
        System.out.println(cs1.toString());
        System.out.println();

        Customer cs2 = new Customer("Gokay",2);
        Customer cs3 = new Customer("John Ward",3);
        System.out.println(cs2.toString());
        System.out.println(cs3.toString());

        //Array of Customers
        Customer[] todayCustomer = {cs1,cs2,cs3, new Customer("Bashir",4)};

        //Array List of Customer Object

        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Muro",54));
        customerList.add(new Customer("Bashir",234));
        customerList.add(new Customer("Mustafa",224));
        customerList.add(new Customer("Askin",231));

        //Print info of first customer object in array and arraylist
        System.out.println(todayCustomer[0].toString()); //toString is optional

        //Print toString() info of all Customer object
        System.out.println(customerList);

        System.out.println("FOR LOOP");
       for (int i=0; i<customerList.size(); i++)
       {
           System.out.println(customerList.get(i));
       }

        System.out.println("FOR EACH LOOP");
       for (Customer each: customerList)
       {
           System.out.println(each);
       }

        System.out.println("LAMbDA");
       customerList.forEach(each -> System.out.println(each.getName()));

       //Print only names of Customer in the list
        for (int i=0; i<customerList.size(); i++)
        {
            customerList.get(i).getName();
        }


    }

}
/*
Do we need both setter and constructors in class?

Yes, they have slightly different purpose.

Constructor only runs once when object is created and we can initialize/assign value to variables.

Car car1 = new Car("mazda",2012)
car1 = new Car("Kia",2015)

In above example, we are creating a new object for kia and mazda. we are not updating the same object values.
Whenever we say NEW, java will create NEW object.
 */