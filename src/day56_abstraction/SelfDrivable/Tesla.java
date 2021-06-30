package day56_abstraction.SelfDrivable;

import day56_abstraction.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting
{
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Testla cost "+(mile *0.10)+" to drive "+mile +" miles" );
    }

    @Override
    public void autoPiloting() {
        System.out.println("");
    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying 'hello hello'");
    }

    @Override
    public void bye() {
        System.out.println("by bye");
    }
}
