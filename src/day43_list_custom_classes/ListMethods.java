package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods
{
    public static void main(String[] args)
    {
        System.out.println(getDays());
        System.out.println("getDays().size() = " + getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));

        List<String> dayNames =getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");

        // this method helps us without using a loop and if conditions
        dayNames.removeIf(day -> day.length()==6);
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomList(2));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums size = " + nums.size());
        //remove number less than 90
        nums.removeIf(n -> n<90);
        System.out.println("nums after remove  = " + nums);
    }

    public static List<String> getDays()
    {
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday",
                " Friday", "Saturday", "Sunday"));
     return days;
    }

    public static List<Integer> getRandomList(int size)
    {
        Random random = new Random();
        List <Integer> nums = new ArrayList<>();

        for (int i=1; i<=size; i++)
        {
            //preventing duplicate number

            int n= random.nextInt(101);
            if (!nums.contains(n))
            {
                nums.add(n);
            }
            // nums.add(random.nextInt(101));// generate random number and add to list
        }
        return nums;
    }
}
