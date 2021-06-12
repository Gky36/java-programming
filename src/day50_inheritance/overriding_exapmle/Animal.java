package day50_inheritance.overriding_exapmle;

public class Animal
{
    String type;
    String name;

    public void speak()
    {
        System.out.println("Animal is speaking");
    }
}
/*
One of the other benefits of inheritance is method overriding, where
we can have some general implementation of the method
in the super parent class and have some specific
implementation in sub class.

Method OverRiding -> 2 methods with same name and same parameters. it works only with inherited methods

Method OverLoading -> 2 methods with same name and different parameters

 */