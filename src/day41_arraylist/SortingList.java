package day41_arraylist;

import java.util.*;

public class SortingList
{
    public static void main(String[] args)
    {
        List<Integer> nums= new ArrayList<>(Arrays.asList(36,6,2,134,53,123));
        System.out.println("Before sort = "+nums);
        Collections.sort(nums);
        System.out.println("After sort = "+nums);


    }
}

/*
SUMMARY:
    - review arraylist
    - practice arraylist methods
    - learn couple new methods
    - for each
    - sort
    - conditions, and loop review/ practice
 */