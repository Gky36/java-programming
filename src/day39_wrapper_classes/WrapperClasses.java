package day39_wrapper_classes;

public class WrapperClasses
{
    public static void main(String[] args)
    {
        int num=100;
        System.out.println("num = " + num);
        num +=10;
        System.out.println(num);

        // this is one way to create a integer method
        Integer n =new Integer(500);
        System.out.println("is n 500 = "+n.equals(500));
        System.out.println(n+300);

        //this is another way to create
        Integer n2=1000;
        System.out.println(n2/50);

        //convert n to String
        String numStr=n2+"";
        String numSt=n2.toString();

        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);

        Byte b1= new Byte((byte)6);
        Byte b2= 10;
        Short sh1= new Short((short) 40);
        Short sh2=50;
        Integer i1= new Integer(100);
        Integer i2=200;
        Long l1=new Long(300L);
        Long l2=345L;
        Float fl1= new Float(5.25);
        Float fl2= 45.3F;
        Double d1= new Double(345.3);
        Double d2= 234.5;

        // char is different than other primitive

        Character ch1= new Character('Q');
        Character ch2='V';

        Boolean bl1= new Boolean(true);
        Boolean bl2= false;
        // we assign variable 2 different type above.


    }
}

/*
 Java is an object oriented language, everything except primitives are objects in java programming
- For that reason, there is a way to convert a primitive to an object using WRAPPER CLASSES
- WRAPPER CLASSES → classes that help convert a primitive into an OBJECT
- primitive type → Wrapper class object type
- primitive → just a single piece of data, and no behavior, it is built into the language
- object → can have multiple data and behavior

Example:

int n = 10;

- [n](http://n.no) has no methods.behaviors/actions. just single data

String word = "java";

- String is object type which means it has different methods
- String is a lass and from String class, we create String objects

char c='a';
ch.

Each primitive has a wrapper class in Java, so that it can act like an object and have behavior.


 */