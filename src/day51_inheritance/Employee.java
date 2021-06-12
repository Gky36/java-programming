package day51_inheritance;

public class Employee extends Object
{
    String jobTitle;

    public double calculateSalary(double hourlyRate)
    {
        return 52 * 20 * hourlyRate * 1.1;
    }

    //toString method is inherited from Object class
    @Override
    public String toString()
    {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
/*
OOP:
    - encapsulation
    - inheritance
    - abstraction
    - polymorphism

Method Overriding -> we override a method when a method is inherited from a parent class and in child class
we add a method wih SAME NAME and SAME PARAMETERS in child class.

 */