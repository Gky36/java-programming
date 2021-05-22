package OfficeHours.Practice_05_19;

public class MyBackYard
{
    public static void main(String[] args)
    {
       Birds birdsOne = new Birds();
       Birds birdsTwo = new Birds();

       birdsOne.setCanFly(true);
       System.out.println(birdsOne.CanFly());
       birdsTwo.setBeakLength(-1);
       System.out.println(birdsTwo.getBeakLength());
    }
}
