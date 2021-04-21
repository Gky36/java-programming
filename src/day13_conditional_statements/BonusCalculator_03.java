package day13_conditional_statements;

public class BonusCalculator_03 {
    public static void main(String[] args) {
        int bonus;
        double salesAmount = 5000.0;
        if (salesAmount <= 1000)
        {
            System.out.println("Good job, you qualified for bonus");
            bonus = 50; //conditional value assignment
        }
        else
            {
            System.out.println("Great job, you are qualifiied for full bonus");
            bonus = 100;
            }
        System.out.println("Your bonus is: $" + bonus);

    }
}

/*
Auto format shortcut in intellij
For MAC:
command+OPTION+L
For Windows
CONTROL+ALT+L
 */