package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB
{
    @Override
    public void absMethodA() { // Concrete sub class must override abstract methods from abstract class or interface
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB() { // Sub class can override non final methods from parent class
        System.out.println("methodB overridden version is called");
    }

    //@Override -> static method are hidden
    public static void staticMethodC(){ // static methods are hidden - not overridden
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("methodD overridden version is called");
    }
}
// First non- abstract child class of abstract class or interface - is called concrete class
// we do not have to override non- abstract methodB, it is optional and we cannot override static method
