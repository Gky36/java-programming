package day34_void_methods;

public class FirstMethod_01
{
    public static void main(String[] args)
    {
        displayMessage();
        for (int i=0; i<10; i++)
        {
           displayMessage();
        }

    }
    public static void displayMessage()
    {
        System.out.println("Hello first Method");
    }
}

/*
    - important part of any programming language to make code RE- USABLE
    - we have been using methods from different classes so far.

        str.toUpperCase()
        str.length()
        Arrays.toString(array)...
        They were already included in Java, so that we can use them.

    We can also write our own CUSTOM METHODS/FUNCTIONS in java
    To make OUR code RE-USABLE.

    We can wrote a custom method and include some code, and everytime we use/call the method,
    our code will run. We can reuse the code in the method.

    CUSTOM FUNCTION: javascript, python, ruby
    - public → "visible to the world" → it is accessible by/ visible to all the  classes in the project(or other projects if our projects are added to that)
- static → can be called without creating an object(no new keyword needed)
- void → no return value, method does not return anything or any value

    → when we call the method, it just executes the code in the method body without returning a value

- displayMessage()→  method name, can be anything, needed to make the name meaningful, it should sound like an action/behavior
- public static void displayMessage(){

    → code here is the body of the method

    → this code will run every time, method is used/called, this is what it makes it re-usable

 */
