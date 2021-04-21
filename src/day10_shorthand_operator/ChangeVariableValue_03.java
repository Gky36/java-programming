package day10_shorthand_operator;

public class ChangeVariableValue_03
{
    public static void main(String[]args)
    {
        int count= 3;
        System.out.println("Count= "+count);
        // add/ increase count by 2
        count= count+2;
        System.out.println("Count= "+count);
        
        int apples=5;
        System.out.println("apple = " + apples);
        apples=apples+10;
        System.out.println("apple = " + apples);
        apples=apples-3;
        System.out.println("apples = " + apples);

        int pizzaSlices=8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices=pizzaSlices/2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        // Get another whole small pizza just for you
        pizzaSlices = pizzaSlices+6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int players = 10;
        System.out.println("players = " + players);
        // double the players to start the match
        players=players*2;
        System.out.println("players = " + players);

        int cents= 244;
        System.out.println("cents = " + cents);
        // keep whole dollars portions and just assign remaining cents
        cents=cents%100;
        System.out.println("Remaining cents = " + cents);

    }
}
