package OfficeHours;

import java.util.Arrays;

public class ConcatTwoArrays
{
    public static void main(String[] args)
    {
        String[]arr1= {"gokay","mustafa"};
        String[]arr2= {"mindy","tatiana"};
        System.out.println(Arrays.toString(concatTwoArray(arr1,arr2)));
    }

    public static String[] concatTwoArray(String[] name, String[]another)
    {
        String []mergeArray = new String[name.length + another.length];
        int i=0;

        for (String each: name)
        {
            mergeArray[i]= each;
            i++;
        }

        for (String each: another)
        {
            mergeArray[i]=each;
            i++;
        }

        return mergeArray;
    }
}
