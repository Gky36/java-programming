package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA extends InterfaceB, Serializable, Cloneable
{
    /**
     * Interface CAN EXTEND Multiple Other Interfaces, interfaces support Multi-Inheritance
     * Whe it extends another interfaces, child interface is not responsible to override any
     */


    /*
        Interfaces can ONLY have PUBLIC STATIC FINAL variables
        Interfaces can only USE public access modifier for all variables and methods
     */

    public static final String TYPE = "interface";
    double MAX_COUNT =500; // this is also public static final

    public abstract void absMethodD(int num);
    public static void  staticMethodE(String str){
        System.out.println("staticMethodE is called with -"+str);
    }

    public default void  staticMethodF(){
        System.out.println("staticMethodF is called with -");
    }


}

/**
 * starting from Java 8 (jdk 1.8)
 * interface can have static and default methods
 */


/*
Before java 8, interface was pure abstraction, only abstract methods were allowed.
public abstract is automatically added, so it is optional to type it. void absMethodD(int num); is enough
 */