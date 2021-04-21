package day37_methods_overloading;

public class VarArgs
{
    public static void main(String[] args)
    {
     addNumbers(10,5);
     addNumbers(100,200,300);
     addNumbers(100, 200, 300 ,400);
    }

    public static void addNumbers(int ... nums)
    {
        //inside the method, it is used as regular way
        int sum=0;
        for (int n:nums)
        {
          sum +=n;
        }
        System.out.println("sum = "+ sum);
    }
}
