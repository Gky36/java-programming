package day45_oop;

public class TrafficLight
{
    String color;

    public void showColor()
    {
        System.out.println("current color = "+color);
    }

    public void changeColor(String newColor) {
        if (newColor.equals("red") || newColor.equals("yellow") || newColor.equals("green"))
        {
            System.out.println("changing color to " + newColor);
            color = newColor;
        }
        else
        {
            System.out.println("ERROR: invalid colir: "+newColor);
        }
    }
}

/*
4 principals:
    - Encapsulation
    - Inheritance
    - Abstraction
    - Polymorphism

Object Oriented Thinking:
    - everything around you are objects
    - all objects interact with each other

    - all objects interact with each other in one way or another
    - each object comes from a class -> class is description, blueprint
     drink is class -> coffee, water

     OBJECT ORIENTED PROGRAMMING also similar to real life objects where we organize our code into dedicated
     classes and from classes we create objects.
     It helps with making code organized, clear, clean, maintainable, reusable.

   Class -> variables -> data/properties/attributes/ fields
            -> methods -> behavior/actions

 */