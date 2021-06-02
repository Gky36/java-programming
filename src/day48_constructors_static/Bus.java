package day48_constructors_static;

public class Bus
{
    Driver driver;
    Engine engine;


    @Override
    public String toString() {
        return driver.getName() + " "+engine.getCylinders();
    }
}
/*
COMPOSITION in JAVA:
    -> when a class has instance variable of a type of other class
    -> Also called HAS-A relationship
 Bus
    properties: Driver, Engine
 Bus HAS-A Driver
 Bus HAS-A Engine

------------------------------------------------------------------------

STATIC:
STATIC keyword means different depending on how it is used.
TO Sum UP:
    STATIC MEMBER(method or variable) belongs to the class itself and not an object.

 Static method -> method can be called using the classname. No need for object to be called.
 Static variable -> shared variable, only single copy of the variable exist and can be used without creating object of the class.
 Static block -> block of code, that runs ONCE, BEFORE anything else when class is loaded to memory.
 Static inner class -> In java, we can create a class INSIDE another class. That inner/ nested class can be staticx.

STATIC METHOD -> method that can be called using the classname. NO need for object to be called.
    -> Static method can also be called using object too.

  1-) MyClass.method1(); -> CLASSNAME.METHODNAME(); works because method1 is static
  2-) MyClass mc= new MyClass();
        mc.method1(); // works with warning

 I.Q:
    Why main method is always static?

    Main method is static so that it can be called without creating object of the class that it is part of
    JRE can call the main method without creating object of the class

INSTANCE METHOD -> is a non-static method in a class. We need to create an object of the class to call it.

 */