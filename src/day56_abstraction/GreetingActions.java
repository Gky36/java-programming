package day56_abstraction;

public class GreetingActions
{
    public static void main(String[] args) {
        MountainLanguage m1= new MountainLanguage();
        m1.hi();
        m1.bye();

        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();
    }
}
