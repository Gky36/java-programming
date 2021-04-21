package day36_methods_with_return;

import java.util.*;

public class Info_02
{
    public static void main(String[] args)
    {
        System.out.println("Full Name: "+fullName());
        System.out.println("Is married? "+isMarried());
        System.out.println("Age: "+getAge());
        System.out.println("Random Year: "+getRandomYear());

        String name = fullName();
        boolean married=isMarried();
        int age=getAge();
        int year=getRandomYear();

        // assigning to storing to different variable
        System.out.println("name = "+name);
        System.out.println("married = "+married);
        System.out.println("age = "+age);
        System.out.println("year = "+year);
    }
    public static String fullName()
    {
        System.out.println("inside fullName method");
        return "Gokay Y";
    }
    public static boolean isMarried()
    {
        return false;
    }
    public static int getAge()
    {
        int age =33;
        return age;
    }
    public static int getRandomYear()
    {
        Random random = new Random();
        int randomYear= random.nextInt(2021);
        return  randomYear;
    }
}
