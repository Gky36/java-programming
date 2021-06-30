package InterviewQuestions;

public class FindMax
{
    /**Write a method that can find the maximum number from an int Array
     int[] arr = {1,4,54,2,3,5,6,7,10,20,45}
     *
     */
    public static int maxArr(int[] x)
    {
        int max = x[0];

        for (int i=0; i<x.length; i++)
        {
            if (x[i]>max)
            {
                max = x[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,54,2,3,5,6,7,10,20,45};

        System.out.println(maxArr(arr));
    }
}
