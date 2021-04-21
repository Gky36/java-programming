package day40_arraylist;
import java.util.*;

public class ArrayListLoop
{
    public static void main(String[] args)
    {
        //this is very common way of declaring ArrayList,
        List<Integer> nums =new ArrayList<>(); // Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(34);nums.add(44);nums.add(2);nums.add(54);nums.add(88);
        nums.add(500);nums.add(5);nums.add(340);nums.add(5);nums.add(0);

        System.out.println("nums = " + nums);
        // it means remove the index 0
        nums.remove(0);
        System.out.println("nums = " + nums);

        // remove with value
        // nums.remove(88); -> index 88 -> index out of bounds exceptions
        nums.remove(new Integer(88));
        System.out.println("nums = " + nums);

        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);

        //for loop- iterate through all values and print
        for (int i=0; i<nums.size(); i++)
        {
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
        // for each loop, and print all in same line
        for (int each:nums)
        {
            System.out.print(each+" ");
        }
    }
}
