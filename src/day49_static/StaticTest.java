package day49_static;

public class StaticTest
{
    static String word = "java";

    public static void main(String[] args) {

        // 1) static method can be called using classname
        StaticMethod.displayMessage("Wooden spoon");
        //1) instance method need an object to be called
        // StaticMethods.instanceMethod(); ERROR
        StaticMethod stm = new StaticMethod();
        stm.instanceMethod();

        // 2) static method can only access other static variables and methods
        //System.out.println(word); we can not access because it is not static
        System.out.println("word = " + word);


    }
}
