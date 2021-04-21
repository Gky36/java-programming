package day32_arrays_split;


import java.sql.Array;
import java.util.Arrays;

public class MaxMinPrice_02
{
    public static void main(String[] args)
    {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

//        Print array values as a String, in same line, with no Loop
//        System.out.println(Arrays.toString(items));
//        System.out.println(Arrays.toString(prices));
//        System.out.println(Arrays.toString(itemIDs));
//
//        double maxPrice=prices[0];
//        int indexOfMaxPrice=0;
//
//        for (int i=0; i<prices.length; i++)
//        {
//            if (prices[i]>maxPrice)
//            {
//                maxPrice=prices[i];
//                indexOfMaxPrice=i;
//            }
//        }
//        System.out.println("maxPrice = " + maxPrice);
//        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
//        System.out.println(prices[indexOfMaxPrice]+ " -$ "+prices[indexOfMaxPrice]+" -# "+itemIDs[indexOfMaxPrice]);

       // Find Most Expensive item

        double maxPrice=0;
        int maxIndex=0;

        for (int i=0; i<items.length; i++)
        {
            if (prices[i]>maxPrice)
            {
                maxPrice=prices[i];
                maxIndex=i;
            }
        }
        System.out.println("The most expensive item is  "+items[maxIndex]+": $"+prices[maxIndex]+" -  #"+itemIDs[maxIndex]);

        // Finding Less Expensive Item:

        double minPrice=0;
        int minIndex=0;

        for (int i=0; i< items.length; i++)
        {
            if (prices[i]<minPrice)
            {
                minPrice=prices[i];
                minIndex=i;
            }
        }
        System.out.println("The less expensive item is  "+items[minIndex]+": $"+prices[minIndex]+" - #"+itemIDs[minIndex]);
    }
}
