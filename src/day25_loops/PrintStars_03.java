package day25_loops;

public class PrintStars_03
{
    public static void main(String[] args) {


        for (int stars=0; stars<=15;stars++)
        {
            System.out.print("\uD83C\uDF1F * ");
        }

        System.out.println();


        String myStars="";

        // for loop: fill 5 stars to myStars variable
        for (int stars=1;stars<=5;stars++)
        {
            myStars += "* ";

        }
        System.out.println("myStars = " + myStars.trim());
    }
}
