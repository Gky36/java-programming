package SaimExamples.Loop_Practice;

public class DynamicAlphabet
{
    public static void main(String[] args)
    {
        char letterLower='a';
        char letterUpper='A';

        System.out.println("Uppercase letter from A to Z");
        while (letterUpper<='Z')
        {
            System.out.print(letterUpper+" ");
            letterUpper++;
        }

        System.out.println("\nLowercase letter from a to z");
        while (letterLower<='z' )
        {
            System.out.print(letterLower+" ");
            letterLower++;
        }

        System.out.println("\nUppercase letter from Z to A");
        while (letterUpper<='Z')
        {
            System.out.print(letterUpper+" ");
            letterUpper--;
        }
    }
}
