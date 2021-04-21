package day05_primitives_concatenation;

public class PrimitivesExample
{
    public static void main(String[] args)
    {
        //  byte > short > int > long
        //  float > double
        // boolean

        byte byteValue = 100;
        short shortValue = 32500;
        int intValue = 100000;
        long longValue = 2500000343400L;
        float floatValue =534234.55F;
        double doubleValue =43.343;
        char charValue = 'G';
        boolean booleanValue =true;

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
        System.out.println(booleanValue);


        System.out.println(byteValue+"\n"+shortValue+"\n"+intValue+"\n"+longValue+"\n"+floatValue+"\n"+doubleValue+"\n"+charValue+"\n"+booleanValue);
    }
}

// Long and FLOAT we have to put the L or F to end because Java think that is a int.
// Otherwise it is not going to work
// Char kullandigimizda sadece tek bir harf kullaniyoruz.(Single character in single quotes)
