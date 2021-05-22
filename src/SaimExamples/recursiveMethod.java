package SaimExamples;

public class recursiveMethod
{
    public static void main(String[] args)
    {
        Recursive(0);
    }
    public static void Recursive(int number)
    {
        System.out.print(number+" ");
        number++;


        if (number<=100)
        {
            Recursive(number);
        }
    }
}
