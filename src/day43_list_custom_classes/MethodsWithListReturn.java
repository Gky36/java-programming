package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn
{
    public static void main(String[] args)
    {
        // 1 second = 1_000_000_000 nanosecond

        long start = System.nanoTime();
        // return ready ArrayList object. No need to new ArrayList
        List <Integer> mlnNums = getIntegerList();
       // System.out.println(mlnNums);
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));
        double listSecond = (end - start) / 1_000_000_000.0;
        System.out.println("ArrayList time = " + (end - start));
        System.out.println("ArrayList second = "+listSecond);

        long st = System.nanoTime();
        int[] arr = getIntegerArray();
       // System.out.println(Arrays.toString(numsArr));
        long end1 = System.nanoTime();
        double second = (end1 - st) / 1_000_000_000.0;
        System.out.println("Array time = " + (end1-st));
        System.out.println("Array time second = "+second);

    }

    public static List<Integer> getIntegerList()
    {
        List <Integer> nums = new ArrayList<>();

        for (int i=0; i<1000_000; i++)
        {
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray()
    {
        //declare empty array with with size 1_000_001
        int[] nums = new int[1_000_001];

        for (int i=0; i< nums.length; i++)
        {
            nums[i]=i;
        }
        return nums;
    }
}
