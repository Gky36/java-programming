package day40_arraylist;

import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
       ArrayList<Integer> nums = new ArrayList<>();
       nums.add(5);
       nums.add(34);
       nums.add(11);

        System.out.println("size = "+nums.size());

        //reading from arraylist
        System.out.println("index 0 = "+nums.get(0));
        System.out.println("index 1 = "+nums.get(1));
        System.out.println("index 2 = "+nums.get(2));
        // System.out.println("index 3 = "+nums.get(3)); // index out of bound exception

        //print all values in same line:
        System.out.println(nums); //Array.toString(numArray) we do not have to do it like Array

        //remove
        nums.remove(1);
        System.out.println(nums);

    }
}
/*
ADD DATA TO ARRAYLIST:
	we use ADD method with our arraylist object.


When we declare arraylist, DEFAULT_CAPACITY = 10. it means java declares arraylist with 10 null data.

Raw ArrayList -> is arraylist that can store objects of ANY TYPE.
It is not recommended to use like this, unless in certain cases.

EX:
	ArrayList list = new ArrayList();
	list.add("hi");
	list.add(15);
	list.add(true);

As you can see - the above list is of RAW type and allows any type of data. It is not recommended.

Instead we need to use Restricted Type that only allows certain type of data.

EX:
RESTRICTED:	ArrayList<Integer> nums = new ArrayList<>();

RAW :       ArrayList nums = new ArrayList(); -> not recommended
-----------------------------------

ARRAYLIST Internally USES normal Arrays. It is based on Array.
It wraps around normal array. It uses dynamic array by copying values.
 */

/*
ArrayList methods:
    => add(value) add value to arraylist
    => size() return the size of arraylist
    => get(index) return value at the index
    => remove(index) removes element at the given index
    => remove(value) removes the value from arrayList
    => contains(element) checks if element is present in list
    => clear() remove

CAPACITY => how many it could hold
SIZE => how many actual values are there

ArrayList uses more computer memory compared to array.
Array by itself is faster.when we have fixed set of data.

 */