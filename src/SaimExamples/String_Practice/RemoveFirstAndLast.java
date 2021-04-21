package SaimExamples.String_Practice;

public class RemoveFirstAndLast
{
    public static void main(String[] args)
    {
        String word="apple";
        String word2="banana";

        System.out.println(word.substring(1));
        System.out.println(word2.substring(0,5));


        /*
        [Middle char]
Given a String, write a program to display the middle character of a string
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.
         */
        String animal="elephant";

        char firstLetter=animal.charAt(0);
        char secondLetter=animal.charAt(1);
        char thirdLetter=animal.charAt(2);
        char fourthLetter= animal.charAt(3);
        char fifthLetter=animal.charAt(4);
        char sixthLetter=animal.charAt(5);
        char seventhLetter=animal.charAt(6);
        char eightLetter=animal.charAt(7);

        if (animal.length() %2==0)
        {
            System.out.println(fourthLetter+""+fifthLetter);
        }
        else
        {
            System.out.println(fourthLetter);
        }
/*
[Initials]
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.
Ex:
input: james bond
output: your initials are JB
 */

        String name="james bond";

        System.out.println(name.toUpperCase().charAt(0)+""+name.toUpperCase().charAt(6));
       
    }
}
