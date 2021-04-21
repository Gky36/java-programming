package day32_arrays_split;

public class ShoppingItems_01
{
    public static void main(String[] args)
    {
        String[] items  = {"Jacket", "Shoes","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};


        System.out.println("---------- FIND THE INDEX OF 'Gloves' in items array ----------");

        for (int i=0; i<items.length;i++)
        {
          if (items[i].equals("Gloves"))
          {
              System.out.println("Gloves found at index: "+i);
              break;
          }
        }
        System.out.println();

        System.out.println("---------- Set boolean to true if first 'iPad' is found ----------");
        boolean iPadExists=false;

        // in this case we can use foreach loop because we do not need index
        for (int i =0; i<items.length;i++)
        {
            if (items[i].equalsIgnoreCase("Ipad"))
            {
                iPadExists=true;
                break; // exit the loop
            }
        }
        System.out.println("IpadExists: "+iPadExists);
        if (iPadExists)
        {
            System.out.println("we purchased ipad");
        }
        System.out.println();


        System.out.println("---------- Print a report shopping item----------");
        for (int i =0; i<items.length; i++)
        {
            System.out.print(items[i]+" $"+prices[i]+" #"+itemIDs[i]);

        }
        System.out.println();

        System.out.println("---------- Look for jacket in items an print all details ----------");
        for (int i=0; i<items.length;i++)
        {
            if (items[i].equalsIgnoreCase("Jacket"))
            {
                System.out.print(items[i]+" $"+prices[i]+"  -#"+itemIDs[i]);
                break;
            }
        }

    }
}
/*
What is the difference between Array and ArrayList?

Array is fixed length in java, once we declare array, we can not resize it.
ArrayList is resizable, we can add/ remove data.
Array can store primitives and objects
ArrayList can store only object
 */

