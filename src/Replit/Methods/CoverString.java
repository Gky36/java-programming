package Replit.Methods;

public class CoverString
{
    /*
The coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

to search and find each appearance of coverME within main

then surround it with square brackets [coverMe]

if you cannot find the coverME within main then just return whole main itself covered [main].

keep in mind that coverME value can be of any length.

Examples:

coverString("java methods", "me") ) ; ==> "java [me]thods"
coverString("java methods", "me") ) ; ==> "java [me]thods"
coverString("java methods", "me") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
coverString("apples", "pears") ) ; ==> "[apples]"
 */

    public static void main(String[] args)
    {
        coverString("java methods", "me");
        coverString("java methods", "me");
        coverString("java methods", "me");
        coverString("Certified Wooden Spoon", "o");

    }
    public static String coverString(String main, String coverME)
    {
        String newCM= "";

        if (main.contains(coverME))
        {
            newCM += "["+ coverME + "]";
            main= main.replace(coverME,newCM);
            return main;
        }
        else
        {
         return  "[" + main + "]";
        }

    }
}
