package day29_nestedloops_arrays;

public class ArraysIntro_06
{
    public static void main(String[] args)
    {
        // This is how we declare array at the beginning
        int[] nums =new int[3];
        nums[0]=5;
        nums[1]=7;
        nums[2]=10;

        // Print values of array
        System.out.println("Value of index 0= "+nums[0]);
        System.out.println("Value of index 1= "+nums[1]);
        System.out.println("Value of index 2= "+nums[2]);

        // We can also use int variable to specify index number
        int i=0;
        System.out.println(nums[i]); //5
        i++;
        System.out.println(nums[i]); //10

        // how to find out the size of the array/
        System.out.println("Number of elements = "+nums.length);

        //store length of array into len variable
        int length=nums.length;
        System.out.println("length = " + length);

        // change values in the array
        nums[0]=100;
        nums[1]=200;
        nums[2]=300;

        // read the value of index 1 and assign same to index 2
        nums[2]=nums[1];

        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);
    }
}
/*
 In java, ARRAYS are fixed size, not re-sizable.
 Once we declare an array with certain size, we can not change the size/length.

 If you need resizable ARRAY, java provides ARRAYLIST  as an optionn, which size can be modified.

 There are different ways to declaring and assigning values to array:

        1) declare and specify the size, then assign values (longer way)
        T
        int [] nums= new int [3];
        num[0]=123;

        2)Declare and assign value un same statement. (shorter way)
        This way is good to use when we already have data to assign values
        int[] num ={123, 21, 322, 423, 222,99, 234}

        in above example, we declare array with size 7 and assign values in same statement.

        3) Declare and assign value in same statement.
        double[] prices = new double[]{10.3, 44.0, 23.23};
        int [] nums = new int[]{123, 21, 322, 423, 222,99, 234}

 */