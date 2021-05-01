package Replit.ForLoopsArray;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++)
        {
            num[i] = scan.nextInt();
        }

        int[] myArray=new int[2];
        if (size>=2)
        {
            myArray[0]=num[0];
            myArray[1]=num[1];
        }
        else
        {
            myArray=num;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
/*
Given an int array num of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3

output: [1, 2]
 */