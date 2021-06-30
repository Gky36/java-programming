package day55_abstraction.exercise_example;

import javafx.beans.binding.When;

public abstract class Exercise
{
   /*
    When we add it abstract we can not create an object from that class
    because an abstract class has abstract method(Methods without body).
    Although an abstract class has a constructor if you will try to create an object of it, It will throw compile time exception.
    */

    public void start() { //non-abstract method
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * -abstract method - method without body/impl, just signature
     * -purpose: letting sub classes implement/override their own way
     */
    public abstract void perform();

    /**
     * another abstract method that concrete sub classes will override/imlement
     * @param minutes - how long is exercise is performed
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);
}
