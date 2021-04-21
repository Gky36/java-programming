package Replit.ForLoopsArray;

import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i=0; i<nums.length/2; i++)
        {
            int count=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=count;
        }
        System.out.println(Arrays.toString(nums));
    }
}
