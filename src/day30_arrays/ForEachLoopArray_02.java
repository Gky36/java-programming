package day30_arrays;

public class ForEachLoopArray_02
{
    public static void main(String[] args)
    {
        int[] data ={32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};

        for (int eachNum : data)
        {
            System.out.println("Each Num: "+eachNum);
        }
        System.out.println();

        for(int i=0; i<data.length;i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.println();

        // Print last value in array using length-1
        System.out.println("Last value "+data[data.length-1]);

        //Print all number backward in same line

        for (int n=data.length-1;n>=0;n--)
        {
            System.out.print(data[n]+" ");
        }

    }
}
