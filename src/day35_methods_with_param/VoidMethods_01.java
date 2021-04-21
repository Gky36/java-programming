package day35_methods_with_param;

public class VoidMethods_01
{
    public static void main(String[] args)
    {
      printAtoZ();
      displayUSFlag();
    }

    public static void printAtoZ()
    {
        for (char character ='A';character<='Z'; character++)
        {
            System.out.print(character+" ");
        }
    }

    public static void displayUSFlag()
    {
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
