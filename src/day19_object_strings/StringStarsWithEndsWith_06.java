package day19_object_strings;

public class StringStarsWithEndsWith_06
{
    public static void main(String[] args)
    {
        String word="intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intel"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));
        System.out.println(word.endsWith("ea"));
        System.out.println(word.endsWith("dea"));

        String name="Irina";
        if (name.endsWith("a"))
        {
            System.out.println("Maybe, it is a female name");
        }

        String firstname="Dr. Nadir";
        if (firstname.startsWith("M"))
        {
            System.out.println("Man");
        }
        else if (firstname.startsWith("Dr."))
        {
            System.out.println("Doctor");
        }
        else if (firstname.startsWith("Mrs."))
        {
            System.out.println("Married woman");
        }
        else if (firstname.startsWith("Ms."))
        {
            System.out.println("Single woman");
        }
        else if (firstname.startsWith("Sr."))
        {
            System.out.println("Senior");
        }

        String url="https:// www.google.com";
        if (url.endsWith(".com"))
        {
            System.out.println("Commercial website");
        }
        else if (url.endsWith(".ru"))
        {
            System.out.println("Russian website");
        }else if (url.endsWith(".gov"))
        {
            System.out.println("Government website");
        }
        else if (url.endsWith(".edu"))
        {
            System.out.println("Education website");
        }
        else if (url.endsWith(".org"))
        {
            System.out.println("Organization website");
        }

    }
}
