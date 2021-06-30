package day58_polymorphism;

public class Casting
{
    public static void main(String[] args) {

        // variable of worker and object of SUPERMAN
        Worker worker = new SuperMan();
        worker.work("SDET");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();

        //DOWNCASTING FROM WORKER TO SUPERMAN
        // Parent to child
        SuperMan superMan = (SuperMan) worker;
        superMan.raiseKid();
        superMan.feedKid();
        superMan.work("java dev");


    }
}
