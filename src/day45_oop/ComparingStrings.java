package day45_oop;

public class ComparingStrings
{
    public static void main(String[] args)
    {
       String word1 = "java"; // in string pool
       String word2 = "java"; // re-use from string pool
       String word3 = new String("java"); // create in HEAP, outside String pool
       String word4= new String("java"); // create in HEAP, outside String pool

        // Same exact value however word3 outside of pool
        System.out.println(word1==word2); //TRUE  -> point to same object in pool
        System.out.println(word1==word3); //FALSE  -> point to different object in HEAP and POOL
        System.out.println(word3==word4); //FALSE This is also brand new in memory thats why this is false, point to different object in HEAP

        // IF VALUE IS DIFFERENT AUTOMATICLY IS FALSE
        System.out.println(word1.equals(word2)); // TRUE - Comparing values
        System.out.println(word2.equals(word3)); // TRUE - Comparing values
        System.out.println(word3.equals(word4)); // TRUE - Comparing values


    }
}
/*
SUMMARY:
    - Only point to same value, and object
    - .equals does not care how create, care values

 */