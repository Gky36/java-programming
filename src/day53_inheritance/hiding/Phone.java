package day53_inheritance.hiding;

public class Phone
{
    String type = "Old school phone";

    public static void use()
    {
        System.out.println("Using the Phone");
    }

    public void call()
    {
        use();
        System.out.println("and making a phone call");
    }
}
/*
 I.Q
 Can variables be overridden in JAVA?
    Variables cannot be overridden, they are hidden.
    Just like static methods.

    Depending on where your code is being executed, that closest version
    will be called.



 */