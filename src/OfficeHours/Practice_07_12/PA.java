package OfficeHours.Practice_07_12;

public class PA {

    public void go(){
        System.out.println("PA GO");
    }

}
/*
Can you answer these?What is an exception?an exceptions stops the normal flow of execution
- Compile time exceptions aka Checked exceptions
-> these exceptions needs to be handled before you are able run
-> The parent class of all checked exceptions is the Exception class
- Run time exceptions aka Unchecked exceptions
-> happen during execution so they don't need to be handled before running
-> The parent class of all unchecked exceptions is the RuntimeException class (which itself is a child of Exception)
How can you handle an exception?
try/catch: try is a block of code you are running and the catch statements define which exceptions may occur, and if they do occur, which actions to take
- multiple catch blocks:The order of the catch blocks is important.
You should define the exceptions from specific to more general going downwards
What is the finally?
-> final, finally, finalize?finally
- is block of code that will always get executed no matter if there is an exception or notthrow vs throws?
throw: causes an exception occurthrow new Exception();
throws: declaring an exception.
Passes that exception outside of the method
-> if the exceptions happens it will thrownHow are exceptions created and how do they work?
All exception, from java libraries, or other dependencies will extend Exception or RuntimeException
 */