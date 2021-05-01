package Replit.ForLoopsArray;

import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicatedNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        String duplicated="";

        for (int i=0; i<nums.length; i++)
        {
            int count=0;
            for (int j=0; j<nums.length; j++)
            {
                if (nums[i]==nums[j])
                {
                    count++;
                }
            }
           if (count>1 && duplicated.contains(nums[i]+""))
           {
               System.out.println(nums[i]);
           }
        }
    }
}
/*
Given an array nums with 7 integers every element is repeated twice - except one.
Find that element and print it to console.
 */