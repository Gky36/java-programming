package day40_arraylist;

import java.util.*;

public class ArrayListMethods
{
    public static void main(String[] args)
    {
        List<String> shoppingList= new ArrayList<>();
        System.out.println("size = "+shoppingList.size());
        System.out.println("isEmpty? = "+shoppingList.isEmpty());
        if (shoppingList.isEmpty())
        {
            System.out.println("List is empty, keep coding java");
        }
        else
        {
            System.out.println("List is not empty, code java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap computer");
        shoppingList.add("mask");
        shoppingList.add("wooden book");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if (shoppingList.isEmpty())
        {
            System.out.println("List is empty, keep coding java");
        }
        else
        {
            System.out.println("List is not empty, code java then go to mall");
        }

        int count =shoppingList.size();
        System.out.println("Items to buy = " + count);

        // ozellikle bisey check etmek istedigimizde contains kullaniyoruz ve boolean olarak donuyor
        System.out.println("is shoes in my list? "+shoppingList.contains("shoes"));
        if (shoppingList.contains("shoes"))
        {
            System.out.println("shoes is in the list");
        }
        else
        {
            System.out.println("shoes is not in the list");
        }
        System.out.println("Buying shoes...");

        // remove from index
        shoppingList.remove("shoes");
        System.out.println("list= "+shoppingList);
        System.out.println("Done shopping, get back to coding");
        // clear the list, remove all items
        shoppingList.clear();
        System.out.println(shoppingList);
    }
}
