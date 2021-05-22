package Practice;

import java.util.Arrays;

public class MultidimensionalArrays
{
    public static void main(String[] args)
    {
        int [] arr = {12124, 1431, 31442, 42542, 4324};
        int [] nums = new int [5];
        int [] numsArr = new int [] {31442, 42542, 4324};

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i]);
        }
        System.out.println();
        for(int each : arr){
            System.out.print(" " + each);
        }
        System.out.println();

        //MULTIDIMENSIONAL ARRAY. Arrays of arrays

        int[][] gokay = { {21, 2342, 23542}, {34532, 21, 1, 4364}, {123,34423, 7, 32, 56}, arr};

        int [] samed = {21, 2342, 23542};
        int tatiana [] = {34532, 21, 1, 4364};
        int mustafa [] = {123,34423, 7, 32, 56};

        int [] [] myMulti = {samed, tatiana, mustafa, arr, {4321, 124314, 11, 43, 56}};

        int [] [] [] array3D = {gokay, myMulti};

        System.out.println(Arrays.deepToString(gokay)); // this is a way to printed without using loop

        for (int i=0; i<gokay.length; i++)
        {
            for (int j=0; j<gokay[i].length; j++)
            {
                System.out.print(gokay[i][j]+ " ");
            }
        }

        System.out.println("MulitDemensional Arraysize = " + gokay.length);
        System.out.println("gokay[1].length = " + gokay[1].length);
    }
}
