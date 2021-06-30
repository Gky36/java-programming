package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {

    /*
        In Abstract classes can have instance variables, static variables with all access modifiers
        In Abstract classes all access modifier are allowed for variables, and static, instance methods.
     */
    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    /*
    Abstract classes can have constructor
     */
    public AbstractA(){
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();
    public void methodB(){
        System.out.println("methodB");
    }
    public static void staticMethodC(){
        System.out.println("static methodC is called");
    }
}

/*
Abstract class can have abstract non abstract, static method
we can add abstract and non abstract method and static method
 */

/*
When to use abstract class:

 */