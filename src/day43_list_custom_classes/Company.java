package day43_list_custom_classes;

public class Company
{
    public static void main(String[] args)
    {
        Employee emp1= new Employee();
        emp1.name = "Gokay";
        emp1.jobTitle = "SDET";
        System.out.println(emp1.name);
        System.out.println(emp1.jobTitle);
        emp1.work();

        Employee emp2= new Employee();
        emp2.name = "Rahib";
        emp2.jobTitle = "Full stack developer";
        System.out.println(emp2.name);
        System.out.println(emp2.jobTitle);
        emp2.work();
    }
}
