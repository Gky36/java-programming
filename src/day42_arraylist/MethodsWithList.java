package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList
{
    public static void main(String[] args)
    {
      List<String> words = new ArrayList<>();
      words.add("java");words.add("html");words.add("selenium");
      words.add("a"); words.add("input"); words.add("title");
      printStrList(words);

      printStrList(Arrays.asList("select, option, br, pyhton, sql, api"));

      List<Integer> nums =Arrays.asList(2,3,5,2,645,343,23,26);
      int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);

    }
    public static void printStrList(List<String> stringList)
    {

        for (String str : stringList)
        {
            System.out.print(str+" ");
        }
        System.out.println();
    }

    public static int sumIntegerList(List<Integer> integerList)
    {
        int sum=0;
        for (Integer nums :integerList)
        {
            sum +=nums;
        }
        return sum;
    }
}
