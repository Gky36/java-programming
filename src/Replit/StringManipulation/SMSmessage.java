package Replit.StringManipulation;

import java.util.*;

public class SMSmessage
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender=message.substring(message.indexOf("<")+1,message.indexOf(">"));

        phoneNumber=message.substring(message.indexOf("[")+1,message.indexOf("]"));
        messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));


        System.out.println("Sender = " + sender);
        System.out.println("PhoneNumber = " + phoneNumber);
        System.out.println("MessageBody = " + messageBody);
    }
}
