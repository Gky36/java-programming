package OfficeHours.Practice_06_22;

/**
 * Create a concrete class Target
 *     - Inherit Shopping and implement all abstract methods
 */

//concrete class is subclass and fist and non abstract class, which means implement in this concrete class
    // Abstraction you can not have
public class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }
}
