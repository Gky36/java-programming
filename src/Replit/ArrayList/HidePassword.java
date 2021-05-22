package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HidePassword
{
   /*
   Hide PasswordGiven an array of passwords (String). Hide each password as a star (*)
   and show the hidden passwordEx:Input:{"one", "hi", "hold}Output: [ ***, **, **** ]
    */

    public static void main(String[] args)
    {
        List<String> str = Arrays.asList("apples","tree","loop","cat","animal");
        List<String> hiddenPassword = new ArrayList<>();
        String star="";

        for (int i=0; i<str.size(); i++)
        {
            for (int j=0; j<str.get(i).length(); j++)
            {
                star +="*";
            }
            hiddenPassword.add(star);
            star="";
        }
        System.out.println(hiddenPassword);
    }
}
