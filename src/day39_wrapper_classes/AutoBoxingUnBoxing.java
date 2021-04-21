package day39_wrapper_classes;

public class AutoBoxingUnBoxing
{
    public static void main(String[] args)
    {
        //auto-boxing  converting from primitive to wrapper class object
        int num1= 500;
        Integer num2=num1;
        Integer num3=234;

        //Un-boxing:
        Double d1= new Double(100.5);
        double d2= d1;
        double d3= new Double(345.3);

    }
}

/*
    What is the purpose of wrapper classes?
    ability to convert from primitive into object

2) Most of Collections use objects, and can not use primitives, so we can use wrapper classes with them

 */

/*
 IQ: What is the difference between Auto-boxing and Un-boxing?
 Auto-boxing is converting from primitive to wrapper class object.

 Un-boxing is converting from wrapper class object to primitive

 AUTO- BOXING EX:
 int n= 50;
 Integer n2 =n;     n is primitive n2 is Wrapper class object
                    when we assigned n to n2, we did AUTO-BOXING converting from primitive into Wrapper class object

 AUTO-BOXING: primitive >> Wrapper class object
 ----------------------
 UN-BOXING EX: converting wrapper class object>> primitive

 Integer n1= new Integer(432);
 int n2 = n1;

 */