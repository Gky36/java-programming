package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList
{
    public static void main(String[] args)
    {
        // finding a number that only unique, which mean appear only one time
        List<Integer> nums= new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        List<Integer> uniqueList = getUniqueList(nums);

        System.out.println("\nuniqueList = " + uniqueList);

    }

    public static List<Integer> getUniqueList(List<Integer> nums) {
        // new arrayList to store only unique numbers
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer each: nums)
        {
            //check if number appears only ONCE in the list
           if (Collections.frequency(nums,each)==1)
           {
               System.out.print(each+" ");
               uniqueList.add(each);
           }
        }
        return uniqueList;
    }
}
