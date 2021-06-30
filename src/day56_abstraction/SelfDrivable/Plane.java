package day56_abstraction.SelfDrivable;

import day56_abstraction.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void hi() {
        System.out.println("Welcome aboard ");
    }

    @Override
    public void bye() {
        System.out.println("Have good one");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying autoPilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost "+(mile *25.0)+" to fly "+mile +" miles" );
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    public void land(){
        System.out.println("Plane is landing - buckle up ");
    }
}
