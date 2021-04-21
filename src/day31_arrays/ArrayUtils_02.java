package day31_arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtils_02
{
    public static void main(String[] args)
    {
//        int[] nums={100, 5, 1, 7,0, -4, 44, 33};
//
//        //print all nums in same line and sort nums
//        System.out.println(Arrays.toString(nums));
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println("min value: "+nums[0]);
//        System.out.println("max value: "+nums[nums.length-1]);

        //sort it and to string
        String[] words={"Java", "C#", "C++", "Kotlin", "Python","Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ",words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        // Sort it and REVERSE IT

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
/*
    ARRAY utility class : has useful methods to work with arrays.
    it is located in java.util.package

    1) sort(array) method:
        it will sort the array in ascending (small to large) order a-z
        Arrays.sort(nums);

    2) Arrays.toString(arrayname)
    it will help us print array vales in single statement without using a loop
 */

