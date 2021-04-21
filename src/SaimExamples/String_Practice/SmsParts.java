package SaimExamples.String_Practice;

public class SmsParts
{
    public static void main(String[] args)
    {
      String sms="Sender: <James Bond>. From Number: [202-123-3456]. " +
              "+ Message: {“I love programming and problem solving}";

      int indexOfSender=sms.indexOf("J");
      int indexOfSender2=sms.indexOf(">");
      System.out.println(sms.substring(indexOfSender,indexOfSender2));

      int indexOfNumber=sms.indexOf("2");
      int indexOfNumber2=sms.indexOf("]");
        System.out.println(sms.substring(indexOfNumber,indexOfNumber2));

      int messageIndx=sms.indexOf("I");
      int messageIndx2=sms.indexOf("}");
        System.out.println(sms.substring(messageIndx,messageIndx2));
    }
}
/*
[SMS parts]
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}”
Separate these parts and print them separately:
“Sender: actualSender” “Number: actualNumber” “Message: actualMessage”
 */