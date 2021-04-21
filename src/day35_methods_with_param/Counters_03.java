package day35_methods_with_param;

public class Counters_03
{
    public static void main(String[] args)
    {
      count(3);
      count(5);
      int num=100;
      count(num);
      String word="wooden spoon";
      count(word.length());

      printAge(1988);
      int birthYear=2001;
      printAge(birthYear);
    }

    public static void count(int num)
    {

        for (int count=0; count<=num; count++)
        {
            System.out.print(count+" ");

        }
        System.out.println();
    }

    public static void printAge(int year)
    {
        int age=2021-year;
        System.out.println("Birth year: "+year+" Age: "+age);
    }
}
