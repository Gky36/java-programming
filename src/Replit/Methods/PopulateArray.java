package Replit.Methods;
import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray
{
    public static void main(String[] args)
    {
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));
    }

    public static int[] populate(int[] r)
    {
        for (int j=r.length-1; j>=0; j--)
        {
            r[j]=j+1;
        }
        return r;
    }

}
/*
The populate method accepts an empty int array and populates it with numbers counting up.

Example:

populate(new int[3])

returns:[1,2,3]
 */