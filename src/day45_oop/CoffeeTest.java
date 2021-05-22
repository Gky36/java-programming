package day45_oop;

public class CoffeeTest
{
    public static void main(String[] args)
    {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = "+ myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = "+myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = "+myCoffee.getAmount());

        // Not: myCoffee.type = "Turkish coffee" INSTEAD using a method
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = "+myCoffee.getType());
        // describe mycoffee -show all variable values
        System.out.println(myCoffee.toString());

        // adding another object, SET VALUES, CALL METHODS
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        // assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;
        System.out.println("coffee 2 type = "+coffee2.getType());
        coffee2.setType("espresso");

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappicono");

        Coffee coffee4 = null;


    }
}
/*
    JAVA MEMORY MANAGEMENT
    String pool
    String is immutable
    String Builder/StringBuffer are mutable

    JAVA MEMORY MANAGEMENT
        - java takes some of the memory from our computer to store objects and primitives
        - java automatically manages the memory, so programmer does not have to worry about it
        - java memory consist of 2 parts
            - STACK
                - primitive variables or object variables, methods are placed in stack
            - HEAP
                - objects are place into heap, it is larger in size compared to stack

    MUTATION --> changing
    Covid19 Mutation -> internally changing

    Immutable -> Not Changing
    String is immutable -> once we create the string object, we can not change the object value any more.
     It will create new Object in HEAP each time we modify the String

    STRING POOL :
        is a special place in HEAP java memory where String object are placed and reused.

     When we create String using "" only, java will first search in String pool if String object already exists,
      if yes, it will reuse it, if not it will create and place the object into String pool

      EX:
        String word = "hi", which is placed into String pool
        String word2 = "hi", which is reused from String pool
        String word3 = new String("hi"); is created in HEAP are outside String pool and not reused, becasue
        we typed NEW keyword.

   ---> ONLY checks if both variables point/refer to same object in HEAP memory. It does not compare values/ charactes in the string
   --- EQUALS() Method compare values/ characters in the strings.
        == never check size, or value
        == equals()



 */