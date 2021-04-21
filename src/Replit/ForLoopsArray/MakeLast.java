package Replit.ForLoopsArray;

import java.util.*;

public class MakeLast
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];

        for(int i =0; i < size; i++)
        {
            nums[i] = scan.nextInt();
        }
    }
}
