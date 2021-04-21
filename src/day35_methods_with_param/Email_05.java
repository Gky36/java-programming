package day35_methods_with_param;


public class Email_05
{
    public static void main(String[] args)
    {
      buildEmail("gokayyazar","hotmail");

      buildEmail("gokayazar","hotmail");


    }
    public static void buildEmail(String name, String domain)
    {
        name=name.replace(" ","_").toLowerCase();
        domain=domain.toLowerCase();
        String email= name+ "@"+domain+".com";
        System.out.println(email);
    }
}

