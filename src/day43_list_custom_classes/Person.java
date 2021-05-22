package day43_list_custom_classes;

public class Person
{
    //Data -> variables
    String firstName;
    int age;
    char gender;
    //behavior
    public void speak()
    {
        System.out.println("Person is speaking ");
    }
}
class People
{
    public static void main(String[] args)
    {
        //create object of Person class- Instantiate Person Class
        Person person = new Person();
        person.firstName = "Bob";
        person.age = 33;
        person.gender ='M';
        person.speak();

        System.out.println(person.firstName);
        System.out.println(person.age);
        System.out.println(person.gender);

        Person person1 = new Person();
        person1.firstName = "Gokay";
        person1.age = 33;
        person1.gender='M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);
    }
}
/*
OBJECT
    - object is an instance of a class
    - object cab store data. The data stored in an object are commonly called fields
    EX:
        - class is general  CAR
        - object is specific Mercedes, Bmw, Audi

   Class => is a template for an object, it will contain data and behavior
   Object => instance of the class. We create object from classes
  */
