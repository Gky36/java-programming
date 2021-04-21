package SaimExamples;

import java.util.Locale;

public class LastFirstLastName
{
    public static void main(String[]args)
    {
        String fullName="James bond";
        String lastName="Bond";

        fullName=fullName.toLowerCase();
        lastName=lastName.toLowerCase();

        if (fullName.contains(lastName))
        {
            System.out.println("Same last name");
        }
        else
        {
            System.out.println("Not the same last name");
        }

        String message="Folks, What the heck happened ? Stop acting like idiot";
        message=message.toUpperCase();

        if (message.contains("idiot") || message.contains("heck") || message.contains("dumb"))
        {
            System.out.println("Message not sent");
        }
        else
        {
            System.out.println("Message sent");
        }

        String address ="700 Rosewood Street, 10467, Bronx, New York";
        address=address.toUpperCase();
        if (address.isEmpty())
        {
            System.out.println("No address found");
        }
        else
        {
            System.out.println(address);
        }
    }
}

/*
Given two String variables. One is a full name and the second a last name.
Check if the full name has the same last name as the other String.
    Ex:
        s: "james bond"
        s: "bond"
        output: Same last name

        s: "alex benji"
        s: "bond"
        output: Not the same last name

 */

/*
Given a String variable with a message. You will check
if the message contains any of these bad words: “idiot, dumb, heck”
    -> If the message contains any of those words print: “Message not sent”.
    -> If the message is bad word free print “Message sent”
 */

/*
A person will enter their address into a String. Make sure the String is not empty.
    If it is empty print: "No address found".
    If there is an address make all the text uppercase to match the expected format

        Ex:
            Input: 231332 leaf ave, lake city 3132
            Output: 231332 LEAD AVE, LAKE CITY 3132

        Ex:
            Input: ""
            Output: No address found
 */