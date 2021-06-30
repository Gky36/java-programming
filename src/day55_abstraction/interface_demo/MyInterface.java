package day55_abstraction.interface_demo;

public interface MyInterface
{
    public abstract void learn();
}

interface MyInterface2 {

}

class MyClass implements  MyInterface, MyInterface2{ // we can implements multiple interfaces, and must override abstract methods of all interfaces
    // instead of extended we use implements
    // class implements interface to inherit from it. It does not extend
    // Class can implement multiple interfaces at the same time.
    @Override
    public void learn()
    {
        System.out.println("Learning in MyClass");
    }

}

class Main{
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); Error because myInterface cannot create object of interface
        MyClass myClass = new MyClass();


    }


}