package day41_arraylist;

import java.util.ArrayList;

public class CitiesList
{
    public static void main(String[] args)
    {
        //declare ArrayList
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arrayList
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to first index
        cities.add(0,"Ashgabat");
        cities.add(1,"Istanbul");
        System.out.println(cities);
        // print first and last city
        System.out.println("First city = " + cities.get(0));
        System.out.println("Last city = "+cities.get(5));
        // find last index using size()-1
        System.out.println("Last city = "+cities.get(cities.size()-1));

        // print count of items in arrayList
        System.out.println("count of items = "+cities.size());

        int size= cities.size();
        System.out.println("there are " + size+" cities in the list");
        // or loop print all values in same line
        for (int i = 0; i < cities.size(); i++)
        {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();

        for (String each:cities)
        {
            System.out.print(each+" ");
        }
        System.out.println();

        // There are two way remove
        // 1.-- remove using index
        cities.remove(0);
        cities.remove(cities.size()-1);

        // 2.-- remove using object/value
        cities.remove("Vienna");
        cities.remove("Washington DC");
        System.out.println(cities);

        cities.clear();
        System.out.println("After clear all values from list = "+cities);

        System.out.println("list is empty = " + cities.isEmpty());
        //check size
        if (cities.size()==0)
        {
            System.out.println("List is empty");
        }
    }
}
/*
WRAPPER CLASSES
    - Special classes to convert a primitive to an object
    - each primitive type has a matching Wrapper classes
        byte => Byte
        short => Short
        int => Integer
        long => Long
        float => Float
        double => Double
        boolean => Boolean
        char => Character
    - They come with useful methods to perform actions
    - We can use wrapper classes with collections.
    - EX: We need Wrapper classes for arraylist:
     Arraylist does not accept primitives, it can only accept objects

ARRAYLIST:
    - ordered collection of data of same type
    - unlike arrays, arraylist is re-sizable, we can change length of arraylist at any time.
    - it is also accepts only objects.
    - we use wrapper classes with arraylist
    - it is array based collection, it used array internally
    - when we add values to arraylist, it remember the index numbers
    ArrayList methods:
       add(index)
       add(index, value) => add to given index position
       -get => returns value at certain index
       -size => returns the count of elements
       -remove(index) => removes element at certain index
       -remove(object) => removes given object from list, if many removes first one
       -clear => remove all elements
       -contains => check if element is present in list
       -isEmpty => return true if no elements, or false if there elements
       - set => updates/replaces value at certain index
       - replace => is not present in ArrayList
            => indexOf + set => can be used to replace
       - toString() => returns all elements as single String, surrounded by[]
       - indexOf =>
 */