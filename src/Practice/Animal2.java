package Practice;

public class Animal2
{
    public static void main(String[] args)
    {
     Animals dogs = new Animals();

     dogs.setGender("Male");
     dogs.setAge(5);
     dogs.setFood("steak");
     dogs.setHeight(5);

        System.out.println(dogs.toString());
    }
}
