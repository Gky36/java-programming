package SaimExamples.Loop_Practice.ForLoopsArray;

public class AverageNumberFromArray
{
    public static void main(String[] args)
    {
        /*
Average Number from Array
Given an int array calculate the average number -> Make it flexible so it will work with any array size
         */
        int nums[]={4, 5, 6, 7, 8, 10, 20, 30, 0};

        int average=0;
        int totalNumbers=0;

        for (int each:nums)
        {
            totalNumbers+=each;
        }
        average=totalNumbers/nums.length;
        System.out.println("Average = " + average);
    }
}
