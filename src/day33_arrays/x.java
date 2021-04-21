package day33_arrays;

import java.util.Arrays;

public class x
{
    public static void main(String[] args)
    {
/*
Given a String, reverse each individual word and print the result
Hint: Use a nested loop, split
Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacihC
 */
        String word="It started to snow in Chicago";
        String wordArray[]=word.split(" ");

        System.out.println(Arrays.toString(wordArray));

        for (int i=0, j=wordArray.length-1;i<wordArray.length/2;i++, j--)
        {
            String temp=wordArray[i];
            wordArray[i]=wordArray[j];
            wordArray[j]=temp;
        }
        System.out.println("After Reverse: "+Arrays.toString(wordArray));
    }
    }
