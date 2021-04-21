package Replit.ForLoopsArray;

import java.util.Arrays;
import java.util.Scanner;

public class InnerAndOuter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] outerSize= new int[scan.nextInt()];
        int[] innerSize = new int[scan.nextInt()];

        for(int j = 0; j < outerSize.length; j++)
        {
            outerSize[j] = scan.nextInt();
        }

        for(int i = 0; i < innerSize.length; i++)
        {
            innerSize[i] = scan.nextInt();
        }
        Arrays.sort(innerSize);
        Arrays.sort(outerSize);

        int count=0;
        for (int i=0; i<outerSize.length; i++)
        {
            for (int n=0; n<innerSize.length; n++)
            {
                if (outerSize[i]==innerSize[n])
                {
                    count++;
                }
            }
        }
        if (count==innerSize.length || count==outerSize.length)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
